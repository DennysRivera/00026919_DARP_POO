using System;

namespace Ejercicio_01
{
    public class Tarea : Evaluacion
    {
        private DateTime fechaEntrega;
        
        public DateTime FechaEntrega => fechaEntrega;

        public Tarea(int porcentaje, String nombre, DateTime fechaEntrega) : base(porcentaje, nombre)
        {
            this.FechaEntrega = fechaEntrega;
        }
    }
}