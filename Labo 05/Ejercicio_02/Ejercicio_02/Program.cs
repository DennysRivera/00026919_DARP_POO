using System;

namespace Ejercicio_02
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            bool palin = true;
            
            Console.Write("Ingrese una frase: ");
            String frase = Console.ReadLine(), fraseInversa = " ";

            if (frase != null)
            {
                frase = frase.Trim();

                for (int i = 0; i < frase.Length; i++)
                {
                    fraseInversa += frase[frase.Length - 1 - i];
                }

                if (frase.ToLower().Replace(" ","").Equals(fraseInversa.ToLower().Replace(" ", "")))
                {
                    Console.WriteLine("La palabra/frase es palindromo: " + palin);
                }
                else
                {
                    Console.WriteLine("La palabra frase es palindromo: " + !palin);
                }
            }
            else
            {
                Console.WriteLine("No había palabra que verificar");
            }
        }
    }
}