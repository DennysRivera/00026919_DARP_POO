using System;
 
namespace Ejercicio_01
{
    public class Evaluacion
    {
        protected int porcentaje;
        protected String nombre;
 
        public int Porcentaje() => porcentaje;
 
        public String Nombre() => nombre;
 
        public Evaluacion(int porcentaje, string nombre)
        {
            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }

        public Evaluacion()
        {
            Console.WriteLine("hola");
        }

        public override string ToString()
        {
            return $"{nameof(nombre)}: {nombre}, {nameof(porcentaje)}: {porcentaje}";
        }
    }
}