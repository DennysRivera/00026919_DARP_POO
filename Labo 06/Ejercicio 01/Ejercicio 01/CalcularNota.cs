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
                Console.Write("Nota en " + it.Nombre() + ": ");
                nota = Convert.ToDouble(Console.ReadLine());
                total += nota * it.Porcentaje();
            }
            
            return total/100;
        }
    }
}