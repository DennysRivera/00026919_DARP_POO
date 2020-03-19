package com.DARP.x00026919;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el n maximo: ");
        int n = scan.nextInt();

        recursion(n, 1);

    }

    static void recursion(int n, int i){
        if(i == n)
            System.out.print(i + " ");
        else{
            System.out.print(i + " ");
            recursion(n, ++i);
            System.out.print(--i + " ");
        }
    }
}
