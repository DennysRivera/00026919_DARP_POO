package com.DARP.x00026919;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String frase = sca.nextLine();
        frase.replace('a', 'b');
        System.out.println("La cadena de texto modificada es:\n" + frase.replace('a', 'b'));
    }
}
