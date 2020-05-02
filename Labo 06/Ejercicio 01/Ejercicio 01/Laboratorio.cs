using System;

namespace Ejercicio_01
{
    public class Laboratorio : Evaluacion
    {
        private String tipo;

        public Laboratorio(int porcentaje, String nombre, String tipo) : base(porcentaje, nombre)
        {
            this.tipo = tipo;
        }
        
        public override string ToString()
        { return $"{nameof(nombre)}: {nombre}, {nameof(porcentaje)}: {porcentaje}, " +
                 $"{nameof(tipo)}: {tipo}";
        }
    }
}