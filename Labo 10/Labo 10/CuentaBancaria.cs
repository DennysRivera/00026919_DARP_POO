using System;

namespace Labo_10
{
    public class CuentaBancaria
    {
        public String propietario;
        public double saldoActual;

        public CuentaBancaria(String nombre = "Sin nombre", double saldoA = 0)
        {
            propietario = nombre;
            saldoActual = saldoA;
        }
    }
}