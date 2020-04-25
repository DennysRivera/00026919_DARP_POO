using System;
using System.Diagnostics;

namespace Ejercicio_04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Ingrese una cadena de texto: ");
            String frase = Console.ReadLine();
            frase = frase.Trim();
            if (frase != "")
            {
                Console.WriteLine("La cadena de texto modificada es:\n" + frase.Replace('a', 'b'));   
            }
            else
            {
                Console.WriteLine("No había cadena de texto");
            }
        }
    }
}