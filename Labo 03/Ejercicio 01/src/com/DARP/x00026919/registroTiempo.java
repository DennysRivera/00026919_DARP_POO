package com.DARP.x00026919;

public class registroTiempo {
    private String ingreso, salida;
    private float estadia;

    public registroTiempo(String ingreso){
        this.ingreso = ingreso;
    }

    public String getIngreso(){
        return ingreso;
    }

    public void setSalida(String salida){
        this.salida = salida;
    }

    public float getEstadia(){
        float aux = 0;
        int size;
        estadia = Float.valueOf(salida) - Float.valueOf(ingreso);
        estadia = Float.parseFloat(String.format("%.4g%n", estadia));
        if (estadia > (estadia % 0.60)) {
            estadia -= 0.40;
            aux++;
            aux += (estadia - 0.60);
        }
        estadia = Float.parseFloat(String.format("%.4g%n", estadia));
        size = String.valueOf(estadia).length();
        if (estadia % 0.50 == 0) {
            return estadia;
        }
        else if (size == 4){
            if (estadia - Integer.parseInt(String.valueOf(estadia).substring(0, 1)) < 0.60) {
                return estadia;
            }
            else
                return aux;
        }
        else if (size == 5){
            if (estadia - Integer.parseInt(String.valueOf(estadia).substring(0, 2)) < 0.60) {
                return estadia;
            }
            else
                return aux;
        }
        else{
            return aux;
        }

    }
}
