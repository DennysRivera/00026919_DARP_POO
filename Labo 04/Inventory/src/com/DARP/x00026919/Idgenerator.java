package com.DARP.x00026919;

public final class Idgenerator {
    static private int counter;

    private Idgenerator(){
    }

    public static int newId(){//Contador para los IDs
        counter++;
        return counter;
    }
}
