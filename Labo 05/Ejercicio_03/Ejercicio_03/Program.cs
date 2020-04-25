using System;

namespace Ejercicio_03
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Ingrese el n máximo: ");
            var n = Convert.ToInt32(Console.ReadLine());

            Recursion(n, 1);
        }

        public static void Recursion(int n, int i)
        {
            if (i == n)
            {
                Console.Write(i + " ");
            }
            else
            {
                Console.Write(i + " ");
                Recursion(n, ++i);
                Console.Write(--i + " ");
            }
        }
    }
}