package com.DARP.x00026919;

import javax.swing.*;
import java.util.ArrayList;

public class Ticket {
    private String entrada, id;
    private double vuelto;
    static Moneda coin = new Moneda();

    public Ticket(registroTiempo ingreso, Automovil unAuto){
        entrada = ingreso.getIngreso();
        id = unAuto.getPlaca();
    }

    public String getId(){
        return id;
    }

    public boolean ticketSalida(registroTiempo unRegistro){
        double cant;
        if(unRegistro.getEstadia() < 0.30){
            cant = 0;
        }
        else if(unRegistro.getEstadia() >= 0.30 && unRegistro.getEstadia() < 1.00){
            cant = 0.50;
        }
        else if(unRegistro.getEstadia() >= 1.00 && unRegistro.getEstadia() < 2.00){
            cant = 1.0;
        }
        else {
            cant = 5.0;
        }
        JOptionPane.showMessageDialog(null, "Su estadia: " + unRegistro.getEstadia() + "\nA pagar: $" + cant);
        coin.calcularGanacia(cant);
        return pagarTicket(cant);
    }

    public boolean pagarTicket(double aPagar){
        double moneda;
        if(aPagar == 0){
            JOptionPane.showMessageDialog(null, "Gracias por su visita");
        }
        else {
            do {
                moneda = Double.parseDouble(JOptionPane.showInputDialog("Monedas aceptadas: $0.05, $0.10, $0.25, $1.00\n" + coin.getTotal()));
                if (moneda != 0.05 && moneda != 0.10 && moneda != 0.25 && moneda != 1.00)
                    JOptionPane.showMessageDialog(null, "Moneda no valida");
                else
                    coin.insertarMoneda(moneda);
            } while (coin.getTotal() < aPagar);

            if (coin.getTotal() > aPagar) {
                vuelto = coin.getTotal() - aPagar;
                JOptionPane.showMessageDialog(null, "Su cambio es\n$" + vuelto);
            }
            JOptionPane.showMessageDialog(null, "Gracias por su visita");

            coin.vaciarMonedas();
        }
        return true;
    }

    public void consultarTicket(){
        JOptionPane.showMessageDialog(null, "Placa: " + id.toUpperCase() + "/ Hora de entrada: " + entrada.replace('.', ':'));
    }

    public double mostrarGanancias(){
        return coin.getGanancia();
    }
}
