package com.DARP.x00026919;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sca = new Scanner(System.in);
    static ArrayList<herramientasMinecraft> inventario = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Se ha conectado");

        menu();
    }

    public static void menu(){
        byte opc, opc2;
        do {
            System.out.print("\n\t1. Agregar herramienta\n\t2. Consultar mis herramientas(todas)\n\t3. Consultar herramienta...");
            System.out.print("\n\t4. Atacar mobs\n\t5. Repara herramientas\n\t6. Cerrar sesión\n\tOpción: ");
            opc = sca.nextByte();

            switch (opc){
                case 1: agregarHerramientas(); break;
                case 2: if(inventario.isEmpty()) System.out.println("No hay herramientas");
                    else
                        inventario.forEach(s -> System.out.println(s.toString()));
                    break;
                case 3: if(inventario.isEmpty()) System.out.println("No hay herramientas");
                    else
                        menuConsulta();
                    break;
                case 4: if (inventario.isEmpty()) System.out.println("No hay herramientas");
                    else {
                        System.out.println("\n*Atacas con todo lo que está en tu inventario*");
                        for (herramientasMinecraft x : inventario) {
                            x.ataque();
                        }
                    }
                    break;
                case 5: if (inventario.isEmpty()) System.out.println("No hay herramientas");
                    else {
                        for (herramientasMinecraft x : inventario) {
                            x.reparar();
                        }
                    }
                    break;
                case 6: break;
                default: System.out.println("\nOpción inválida");
            }
        }while (opc != 6);
    }

    public static void agregarHerramientas(){
        byte opc;
        String herramienta = "", material = "";
        int durabilidad, daño = 0;
        double velAtaque = 0;

        do {
            System.out.print("\nAgregar...\n1. Hacha\n2. Pico\n3. Espada\n4. Pala\n5. Hoz\n6. No agregar\n Opción: ");
            opc = sca.nextByte();
            switch (opc){
                case 1: herramienta = "Hacha"; velAtaque = 0.9; break;
                case 2: herramienta = "Pico"; velAtaque = 1.2; daño = 1; break;
                case 3: herramienta = "Espada"; velAtaque = 1.6; daño = 2; break;
                case 4: herramienta = "Pala"; velAtaque = 1.0; daño = 1; break;
                case 5: herramienta = "Hoz"; velAtaque = 1.0; break;
                case 6: break;
                default: System.out.println("Opción inválida"); break;
            }
        }while (opc < 1 || opc > 6);

        do{
            if(opc == 6) break;
            System.out.print("De...\n1. Piedra\n2. Hierro\n3. Oro\n4. Diamante\nOpción: ");
            opc = sca.nextByte();
            switch (opc){
                case 1:
                    material = "Piedra";
                    durabilidad = 131;
                    if(herramienta.equals("Hacha")) inventario.add(new herramientasMinecraft(herramienta, material, 9, durabilidad, velAtaque));
                    else if(herramienta.equals("Hoz")) inventario.add(new herramientasMinecraft(herramienta, material, 1, durabilidad, velAtaque));
                    else inventario.add(new herramientasMinecraft(herramienta, material, (daño + material.length()), durabilidad, velAtaque));
                    break;
                case 2:
                    material = "Hierro";
                    durabilidad = 250;
                    if(herramienta.equals("Hacha")) inventario.add(new herramientasMinecraft(herramienta, material, 9, durabilidad, velAtaque));
                    else if(herramienta.equals("Hoz")) inventario.add(new herramientasMinecraft(herramienta, material, 1, durabilidad, velAtaque));
                    else inventario.add(new herramientasMinecraft(herramienta, material, (daño + material.length()), durabilidad, velAtaque));
                    break;
                case 3:
                    material = "Oro";
                    durabilidad = 32;
                    if(herramienta.equals("Hacha")) inventario.add(new herramientasMinecraft(herramienta, material, 9, durabilidad, velAtaque));
                    else if(herramienta.equals("Hoz")) inventario.add(new herramientasMinecraft(herramienta, material, 1, durabilidad, velAtaque));
                    else inventario.add(new herramientasMinecraft(herramienta, material, (daño + material.length()), durabilidad, velAtaque));
                    break;
                case 4:
                    material = "Diamante";
                    durabilidad = 1561;
                    if(herramienta.equals("Hacha")) inventario.add(new herramientasMinecraft(herramienta, material, 9, durabilidad, velAtaque));
                    else if(herramienta.equals("Hoz")) inventario.add(new herramientasMinecraft(herramienta, material, 1, durabilidad, velAtaque));
                    else inventario.add(new herramientasMinecraft(herramienta, material, (daño + material.length()), durabilidad, velAtaque));
                    break;
                default: System.out.println("Opción inválida"); break;
            }
        }while (opc < 1 || opc > 4);
    }

    public static void menuConsulta(){
        byte opc;
        do{
            System.out.print("\nConsultar...\n\t1. Hachas\n\t2. Picos\n\t3. Espadas\n\t4. Palas\n\t5. Hoces\n\t6. Regresar\n\tOpción: ");
            opc = sca.nextByte();
            switch (opc){
                case 1:
                    for (herramientasMinecraft x : inventario)
                        if(x.getTipoHerramienta().equals("Hacha")) System.out.println(x);
                    break;
                case 2:
                    for (herramientasMinecraft x : inventario)
                        if(x.getTipoHerramienta().equals("Pico")) System.out.println(x);
                    break;
                case 3:
                    for (herramientasMinecraft x : inventario)
                        if(x.getTipoHerramienta().equals("Espada")) System.out.println(x);
                    break;
                case 4:
                    for (herramientasMinecraft x : inventario)
                        if(x.getTipoHerramienta().equals("Pala")) System.out.println(x);
                    break;
                case 5:
                    for (herramientasMinecraft x : inventario)
                        if(x.getTipoHerramienta().equals("Hoz")) System.out.println(x);
                    break;
                case 6: break;
                default: System.out.println("Opción inválida"); break;
            }
        }while (opc < 1 || opc > 6);
    }
}
