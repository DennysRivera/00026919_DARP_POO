package com.DARP.x00026919;

import java.util.Scanner;

public class herramientasMinecraft {
    private String tipoHerramienta;
    private String material;
    private int durabilidad;
    private int daño;
    private double velocidadAtaque;

    public herramientasMinecraft(String tipoHerramienta, String material, int daño,int durabilidad, double velocidadAtaque){
        this.tipoHerramienta = tipoHerramienta;
        this.material = material;
        this.durabilidad = durabilidad;
        this.daño = daño;
        this.velocidadAtaque = velocidadAtaque;
    }

    public void ataque() {
        if (durabilidad <= 0) {
            System.out.println(tipoHerramienta + " de " + material + " se ha roto");
        }
        else {
            System.out.println("Se inflingió " + daño + " de daño con " + tipoHerramienta + " de " + material);
            if (tipoHerramienta.equals("Espada") || tipoHerramienta.equals("Hoz")) {
                durabilidad -= 10;
            } else durabilidad -= 20;
        }
        if(durabilidad < 0) durabilidad = 0;
    }

    public void reparar(){
        switch (material){
            case "Piedra":
                if(durabilidad >= 131){
                    durabilidad = 131;
                    System.out.println(tipoHerramienta + " de " + material + " reparado completamente");
                }
                else System.out.println(tipoHerramienta + " de " + material + " reparado por 5 puntos");
                durabilidad += 5;
                if(durabilidad > 131) durabilidad = 131;
                break;
            case "Hierro":
                if(durabilidad >= 250) {
                    durabilidad = 250;
                    System.out.println(tipoHerramienta + " de " + material + " reparado completamente");
                }
                else System.out.println(tipoHerramienta + " de " + material + " reparado por 5 puntos");
                durabilidad += 5;
                if(durabilidad > 250) durabilidad = 250;
                break;
            case "Oro":
                if(durabilidad >= 32) {
                    durabilidad = 32;
                    System.out.println(tipoHerramienta + " de " + material + " reparado completamente");
                }
                else System.out.println(tipoHerramienta + " de " + material + " reparado por 5 puntos");
                durabilidad += 5;
                if(durabilidad > 32) durabilidad = 32;
                break;
            case "Diamante":
                if(durabilidad >= 1561){
                    durabilidad = 1561;
                    System.out.println(tipoHerramienta + " de " + material + " reparado completamente");
                }
                else System.out.println(tipoHerramienta + " de " + material + " reparado por 5 puntos");
                durabilidad += 5;
                if(durabilidad > 1561) durabilidad = 1561;
                break;
        }
    }

    public String getTipoHerramienta(){
        return tipoHerramienta;
    }
    public int getDurabilidad(){
        return durabilidad;
    }

    public String toString(){
        return tipoHerramienta + " de " + material + ": Daño: " + daño + "/ Durabilidad: " + durabilidad +  "/ Velocidad Ataque: " + velocidadAtaque;
    }
}
