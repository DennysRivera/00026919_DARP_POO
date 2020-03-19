package com.DARP.x00026919;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Escriba algo:");
        String frase = sca.nextLine();
        //char[] vocales = new char[frase.length()];
        ArrayList<Character> vocales = new ArrayList<>();
        char letra;
        for (byte i = 0;i<frase.length();i++){
            letra = frase.charAt(i);
            switch(letra){
                case 'a': vocales.add(letra); break;
                case 'e': vocales.add(letra); break;
                case 'i': vocales.add(letra); break;
                case 'o': vocales.add(letra); break;
                case 'u': vocales.add(letra); break;
                case 'A': vocales.add(letra); break;
                case 'E': vocales.add(letra); break;
                case 'I': vocales.add(letra); break;
                case 'O': vocales.add(letra); break;
                case 'U': vocales.add(letra); break;
                default: break;
            }
        }
        System.out.println("Las vocales encontradas son:");
        vocales.forEach(j-> System.out.print(j + " "));
    }
}
