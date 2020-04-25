using System;
using System.Collections.Generic;

namespace Meet2304
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            //List<Persona> p = new List<Persona>();
            var p = new  List<Persona>();
            p.Add(new Persona("Dennys", "Rivera", 20));
            p.Add(new Persona(nombre: "Batar",  edad: 19));
            p.Add(new Persona(edad: 22));
            p.Add(new Persona(apellido: "Pascasio"));

            String buscar = "Dennys";
            buscar = Console.ReadLine();
                
            p.ForEach(it =>
            {
                if (buscar.Equals(it.Nombre))
                {
                    Console.WriteLine("Nuevo Nombre: ");
                    it.Nombre = Console.ReadLine();
                    Console.WriteLine(it.ToString());
                }
            });

            int añadir = 12;
            int árbol = 14;
        }
    }
}