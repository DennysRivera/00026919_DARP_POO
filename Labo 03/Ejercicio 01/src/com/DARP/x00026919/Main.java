package com.DARP.x00026919;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Ticket> tickets = new ArrayList<>();
    static registroTiempo unRegistro;
    static Automovil unAuto;
    static double ganancia = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        //double ganancia = 0;
        byte opc;
        do {
            opc = Byte.parseByte(JOptionPane.showInputDialog("Bienvenido\n1. Ingresar automóvil\n2. Salir del parqueo\n3. Consultar ticket\n4. Salir\nOpción:"));
            switch (opc){
                case 1: ingresoAuto(); break;
                case 2: salirParqueo(); break;
                case 3: consultarTicket(); break;
                case 4:
                     JOptionPane.showMessageDialog(null, "Ganancias de hoy: $" + ganancia);
                    JOptionPane.showMessageDialog(null, "Saliendo..."); break;
                default: JOptionPane.showMessageDialog(null, "Opción inválida"); break;
            }
        }while (opc != 4);
    }

    public static void ingresoAuto(){
        String placa, ingreso;
        boolean flag = true, flag2 = true;
        placa = JOptionPane.showInputDialog(null, "Placa del automóvil:");
        unAuto = new Automovil(placa);
        for (Ticket a : tickets) {
            if (a.getId().equalsIgnoreCase(placa)) {
                JOptionPane.showMessageDialog(null, "Placa ingresada anteriormente");
                flag = false;
                break;
            }
        }
        if(flag) {
            do {
                ingreso = JOptionPane.showInputDialog(null, "Hora de entrada (h:m):\n(Sistema de 24 hrs)");
                if(!(ingreso.contains(":")))
                    JOptionPane.showMessageDialog(null, "Formato de hora invalido");
                else {
                    int horaAux = ingreso.length();
                    if(horaAux > 5 || horaAux < 4) JOptionPane.showMessageDialog(null, "Hora inválida");
                    ingreso = ingreso.replace(':', '.');

                    if (horaAux == 5) {
                        if (Integer.parseInt(ingreso.substring(0, 2)) > 24)
                            JOptionPane.showMessageDialog(null, "Hora inválida");
                        else if (Integer.parseInt(ingreso.substring(3, 5)) > 59)
                            JOptionPane.showMessageDialog(null, "Hora inválida");
                        else {
                            unRegistro = new registroTiempo(ingreso);
                            tickets.add(new Ticket(unRegistro, unAuto));
                            flag2 = false;
                        }
                    }
                    else if (horaAux == 4) {
                        if (Integer.parseInt(ingreso.substring(2, 4)) > 59) JOptionPane.showMessageDialog(null, "Hora inválida");
                        else {
                            unRegistro = new registroTiempo(ingreso);
                            tickets.add(new Ticket(unRegistro, unAuto));
                            flag2 = false;
                        }
                    }
                }
            }while (flag2);
        }
    }

    public static void salirParqueo(){
        boolean flag = true, flag2 = true, bAux = true;
        if (tickets.isEmpty())
            JOptionPane.showMessageDialog(null, "No han ingresado autos");
        else {
            String placa = JOptionPane.showInputDialog("Placa del automóvil: ");
            for (Ticket x : tickets) {
                if (x.getId().equalsIgnoreCase(placa)) {
                    flag2 = true;
                    do {
                        String salida = JOptionPane.showInputDialog("Hora de salida (h:m):\n(Sistema de 24 hrs)");
                        if (!(salida.contains(":")))
                            JOptionPane.showMessageDialog(null, "Formato de hora invalido");

                        else {
                            if (salida.length() > 5 || salida.length() < 4)
                                JOptionPane.showMessageDialog(null, "Hora inválida");
                            salida = salida.replace(':', '.');

                            if (salida.length() == 5) {
                                if (Integer.parseInt(salida.substring(0, 2)) > 24)
                                    JOptionPane.showMessageDialog(null, "Hora inválida");
                                else if (Integer.parseInt(salida.substring(3, 5)) > 59)
                                    JOptionPane.showMessageDialog(null, "Hora inválida");
                                else if (Float.parseFloat(salida) < Float.parseFloat(unRegistro.getIngreso()))
                                    JOptionPane.showMessageDialog(null, "Hora de salida no puede ser antes de\nla hora de ingreso");
                                else {
                                    unRegistro.setSalida(salida);
                                    flag = false;
                                    bAux = x.ticketSalida(unRegistro);
                                    ganancia = x.mostrarGanancias();
                                }
                            } else if (salida.length() == 4) {
                                if (Integer.parseInt(salida.substring(2, 4)) > 59)
                                    JOptionPane.showMessageDialog(null, "Hora inválida");
                                else if (Float.parseFloat(salida) < Float.parseFloat(unRegistro.getIngreso()))
                                    JOptionPane.showMessageDialog(null, "Hora de salida no puede ser antes de\nla hora de ingreso");
                                else {
                                    unRegistro.setSalida(salida);
                                    flag = false;
                                    bAux = x.ticketSalida(unRegistro);
                                    ganancia = x.mostrarGanancias();
                                }
                            }
                        }
                    } while (flag);
                } else flag2 = false;
            }
           // for (Ticket t : tickets) {
             //   ganancia += t.mostrarGanancias();
            //}
            boolean finalBAux = bAux;
            tickets.removeIf(x -> {
                if (x.getId().equalsIgnoreCase(placa))
                    //return x.ticketSalida(unRegistro);
                    return finalBAux;
                else return false;
            });
            if (!flag2) JOptionPane.showMessageDialog(null, "Ticket no encontrado");
        }
    }

    public static void consultarTicket(){
        if(tickets.isEmpty())
            JOptionPane.showMessageDialog(null, "No hay tickets para consultar");
        else {
            boolean flag = true;
            String placa = JOptionPane.showInputDialog("Ingrese la placa del automóvil: ");
            for (Ticket x : tickets)
                if (x.getId().equalsIgnoreCase(placa)) {
                    x.consultarTicket();
                    flag = false;
                    break;
                }
            if (flag)
                JOptionPane.showMessageDialog(null, "Placa no encontrada");
        }
    }

}
