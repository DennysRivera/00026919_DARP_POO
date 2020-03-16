package com.DARP.x00026919;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 1, c = 0, n;

        System.out.print("Ingrese cuantos elementos de la serie de Fibonacci mostrar: ");
        n = scan.nextInt();
        System.out.println("Estos son los primeros " + n + " elementos:");

        for(int i=0;i<n;i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

