using System;
using System.Collections.Generic;
using System.ComponentModel.Design;
using System.Linq.Expressions;

namespace Labo_10
{
    public class Program
    {
        private delegate void unDelegate();
        private static unDelegate ud;
        public static void Main(string[] args)
        {
            Action<List<CuentaBancaria>> anAction;
            
            byte opc = 0;
            var cuentas = new List<CuentaBancaria>();
            
            anAction = MostrarCuentas;
            anAction += MostralTotal;
            anAction += NombresVocal;

            do
            {
                Console.Write("\nMenu\n" + Menu());
                opc = Convert.ToByte(Console.ReadLine());
                
                switch (opc)
                {
                    case 1:
                        string nombre = "";
                        double saldo = 0;
                        do
                        {
                            Console.Write("Nombre del propietario de la cuenta: ");
                            nombre = Console.ReadLine();
                            Console.Write("Saldo con la que se abre la cuenta: $");
                            saldo = Convert.ToDouble(Console.ReadLine().Replace('.', ','));
                            
                            if (nombre.Equals("") || saldo < 10)
                                Console.WriteLine("Nombre inválido o cantidad debajo de la permitida(10)");
                            
                        } while (nombre.Equals("") || saldo < 10);

                        cuentas.Add(new CuentaBancaria(nombre, saldo));
                        Console.WriteLine("Cuenta agregada");
                        break;

                    case 2:
                        if (cuentas.Count == 0)
                            Console.WriteLine("\nNo hay cuentas que ver");
                        else
                            MostrarCuentas(cuentas);
                        break;
                    
                    case 3:
                        if (cuentas.Count == 0)
                            Console.WriteLine("\nNo hay cuentas que ver");
                        else
                        {
                            ud = () =>
                            {
                                cuentas.ForEach(cu =>
                                {
                                    Console.WriteLine(
                                        $"Propietario: {cu.propietario} | Saldo actual: ${cu.saldoActual}");
                                });
                            };
                            ud += () =>
                            {
                                double total = 0;
                                cuentas.ForEach(cu => { total += cu.saldoActual; });
                                Console.WriteLine("Total de las cuentas: $" + total);
                            };

                            ud.Invoke();
                        }

                        break;
                    
                    case 4:
                        if (cuentas.Count == 0)
                            Console.WriteLine("\nNo hay cuentas que ver");
                        else
                            anAction.Invoke(cuentas);
                        break;
                        
                    case 5:
                        Console.WriteLine("Saliendo...");
                        break;
                    
                    default:
                        Console.WriteLine("Opción inválida");
                        break;
                }
            } while (opc != 5);
        }

        public static string Menu()
        {
            return "1. Agregar cuenta\n" +
                   "2. Ver cuentas almacenadas\n" +
                   "3. Ver cuentas almacenadas y total de las cuentas\n" +
                   "4. Buscar cuentas por letra\n" +
                   "5. Salir\n" +
                   "Opción: ";
        }

        public static void MostrarCuentas(List<CuentaBancaria> cuentas)
        {
            cuentas.ForEach(cu =>
            {
                Console.WriteLine(
                    $"Propietario: {cu.propietario} | Saldo actual: ${cu.saldoActual}");
            });
        }

        public static void MostralTotal(List<CuentaBancaria> cuentas)
        {
            double total = 0;
            cuentas.ForEach(cu => { total += cu.saldoActual; });
            Console.WriteLine("Total de las cuentas: $" + total);
        }

        public static void NombresVocal(List<CuentaBancaria> cuentas)
        {
            Console.WriteLine("\nCuentas de personas cuyo nombre inicia con vocal");
            cuentas.ForEach(cu =>
            {
                switch (cu.propietario[0])
                {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        Console.WriteLine(
                            $"Propietario: {cu.propietario} | Saldo actual: ${cu.saldoActual}");
                        
                        break;
                }
            });
        }
    }
}