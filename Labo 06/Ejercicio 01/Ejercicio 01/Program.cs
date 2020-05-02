using System;
using System.Collections.Generic;
using System.Linq;

namespace Ejercicio_01
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var evaluaciones = new List<Evaluacion>();
            byte opc = 0;
            int totalPorcentaje = 0;
            do
            {
                try
                {
                    Console.WriteLine(Menu());
                    opc = Convert.ToByte(Console.ReadLine());
                    switch (opc)
                    {
                        case 1: totalPorcentaje = AgregarEvaluacion(totalPorcentaje, evaluaciones); break;

                        case 2:
                            if (evaluaciones.Any())
                                foreach (var ev in evaluaciones)
                                    Console.WriteLine(ev.ToString());

                            else Console.WriteLine("No hay evaluaciones agregadas");
                            break;

                        case 3:
                            bool flag2 = false;
                            if (evaluaciones.Any())
                            {
                                Console.Write("Nombre de la evaluación a eliminar: ");
                                String eliminar = Console.ReadLine();

                                foreach (var ev in evaluaciones)
                                {
                                    if (eliminar.Equals(ev.Nombre()))
                                    {
                                        totalPorcentaje -= ev.Porcentaje();
                                        evaluaciones.Remove(ev);
                                        Console.WriteLine("Evaluación eliminada\n");
                                        flag2 = true;
                                        break;
                                    }
                                }

                                if (flag2) Console.WriteLine("No se encontró la evaluación");
                            }
                            else Console.WriteLine("No hay evaluaciones agregadas");
                            break;

                        case 4:
                            if (evaluaciones.Any())
                            {
                                Console.WriteLine("Calculando promedio...\n");
                                Console.WriteLine(CalcularNota.Calcular(evaluaciones) + " es su promedio");
                            }
                            else Console.WriteLine("No hay evaluaciones agregadas");
                            break;

                        default:
                            Console.WriteLine("Opción inválida");
                            break;
                    }
                }
                catch(FormatException)
                {
                    Console.WriteLine("No se reconoció la opción");
                }
            } while (opc != 4);
        }

        public static String Menu()
        {
            return
                "1) Agregar evaluación\n2) Mostrar evaluaciones almacenadas\n3) Eliminar evaluación\n4) Terminar programa";
        }

        public static int AgregarEvaluacion(int totalPorcentaje, List<Evaluacion> evaluaciones)
        {
            byte opc2;
            if (totalPorcentaje < 100)
            {
                bool flag;
                int porcent;
                Console.Write("Evaluación:\n1) Laboratorio\n2) Parcial\n3) Tarea\nOpción: ");
                opc2 = Convert.ToByte(Console.ReadLine());
                String nombre;
                Console.Write("\nNombre de la evaluación: ");
                nombre = Console.ReadLine().Trim();
                if (nombre.Equals(""))
                {
                    Console.WriteLine("Nombre inválido");
                    return 0;
                }
                do
                {
                    Console.Write("Porcentaje de la evaluación: %");
                    porcent = Convert.ToInt32(Console.ReadLine().Trim());
                    if ((porcent < 1 || porcent > 100) || totalPorcentaje + porcent > 100)
                    {
                        Console.WriteLine("Porcentaje inválido\n(Porcentaje acumulado: %" +
                                          totalPorcentaje + ')');
                        flag = false;
                    }
                    else
                    {
                        totalPorcentaje += porcent;
                        flag = true;
                    }
                } while ((porcent < 1 || porcent > 100) || !flag);

                switch (opc2)
                {
                    case 1:
                        Console.Write("Tipo de laboratorio: ");
                        String tipo = Console.ReadLine().Trim();
                        evaluaciones.Add(new Laboratorio(porcent, nombre, tipo));
                        break;
                    case 2:
                        Console.Write("Cantidad de preguntas del parcial: ");
                        int cantP = Convert.ToInt32(Console.ReadLine().Trim());
                        evaluaciones.Add(new Parcial(porcent, nombre, cantP));
                        break;
                    case 3:
                        DateTime fechaE = Convert.ToDateTime(null);
                        bool valido;
                        do
                        {
                            try
                            {
                                Console.Write("Fecha de entrega de la tarea (dd/mm/aa): ");
                                fechaE = Convert.ToDateTime(Console.ReadLine().Trim());
                                valido = true;
                            }
                            catch (FormatException)
                            {
                                Console.WriteLine("No se reconoció la fecha");
                                valido = false;
                            }
                        } while (!valido);

                        evaluaciones.Add(new Tarea(porcent, nombre, fechaE));
                        break;
                    default:
                        Console.WriteLine("Opción inválida");
                        break;
                }

                Console.WriteLine("Evaluación agregada\n");
            }
            else Console.WriteLine("\nLa suma de los porcentajes es %100\n");

            return totalPorcentaje;
        }
    }
}