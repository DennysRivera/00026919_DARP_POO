using System;
using System.Collections.Generic;

namespace Ejercicio_05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Escriba algo: ");
            String frase = Console.ReadLine();
            
            List<char> vocales = new List<char>();
            char letra;
            foreach (var l in frase)
            {
                letra = l;
                switch (letra)
                {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U': vocales.Add(letra); break;
                }
            }
            Console.WriteLine("Las vocales encontradas son: ");
            foreach (var vocal in vocales)
            {
                Console.Write(vocal + " ");
            }
        }
    }
}