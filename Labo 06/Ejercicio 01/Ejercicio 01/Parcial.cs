﻿using System;

namespace Ejercicio_01
{
    public class Parcial : Evaluacion
    {
        private int cantPreguntas;

        public Parcial(int porcentaje, String nombre, int cantPreguntas) : base(porcentaje, nombre)
        {
            this.cantPreguntas = cantPreguntas;
        }
    }
}