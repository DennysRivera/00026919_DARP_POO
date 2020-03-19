package com.DARP.x00026919;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean palin = true;

        System.out.print("Ingrese una frase: ");
        String frase = scan.nextLine(), fraseInversa = "";

        frase = frase.trim();
        int length = frase.length();

        for(int i=0;i<length;i++){
            fraseInversa += frase.charAt(length-1-i);
        }
        if(frase.replaceAll(" ", "").equalsIgnoreCase(fraseInversa.replaceAll(" ", "").toLowerCase()))
            System.out.println("La palabra/frase es palindromo: " + palin);
        else
            System.out.println("La palabra/frase es palindromo: " + !palin);
    }
}
