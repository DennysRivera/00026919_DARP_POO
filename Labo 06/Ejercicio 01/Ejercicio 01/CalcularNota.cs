using System;
using System.Collections.Generic;

namespace Ejercicio_01
{
    public static class CalcularNota
    {
        static public double Calcular(List<Evaluacion> ev)
        {
            double total = 0, nota;
            foreach (var it in ev)
            {
                do
                {
                    Console.Write("Nota en " + it.Nombre() + ": ");
                    nota = Convert.ToDouble(Console.ReadLine());
                    if (nota < 0 || nota > 10)
                    {
                        Console.WriteLine("Nota inválida");
                    }
                } while (nota < 0 || nota > 10);

                total += nota * it.Porcentaje();
            }
            
            return total/100;
        }
    }
}