package com.DARP.x00026919;

import java.util.ArrayList;

public class Moneda {
    private double valor, ganancia = 0;
    private ArrayList<Moneda> monedasInsertadas = new ArrayList<>();

    public Moneda(double valor){
        this.valor = valor;
    }

    public Moneda(){
    }

    public void insertarMoneda(double valor){
        monedasInsertadas.add(new Moneda(valor));
    }

    public void vaciarMonedas(){
        monedasInsertadas.clear();
    }

    public double getTotal(){
        double total = 0;
        for (Moneda x : monedasInsertadas) {
            total += x.getValor();
        }
        return total;
    }

    public double getValor(){
        return valor;
    }

    public void calcularGanacia(double ganancia){
        this.ganancia += ganancia;
    }

    public double getGanancia(){
        return ganancia;
    }
}
