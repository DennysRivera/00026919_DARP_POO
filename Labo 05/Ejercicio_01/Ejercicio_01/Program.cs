using System;

namespace Ejercicio_01
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int a = 0, b = 1, c = 0, n;
            
            Console.Write("Ingrese cuantos elementos de la serie de Fibonacci mostrar: ");
            n = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("Estos son los primeros " + n + " elementos:");

            for (int i = 0; i < n; i++)
            {
                Console.Write(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
        }
    }
}