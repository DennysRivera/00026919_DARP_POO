package com.DARP.x00026919;

import javax.swing.*;

public class Potion extends HealthItem {
    private int amount;

    public Potion(String name, String level, String type, int reuseTime, String description, int amount) {
        super();
        this.name = name;
        this.level = level;
        this.type = type;
        this.reuseTime = reuseTime;
        this.description = description;
        this.amount = amount;
    }

    @Override
    void drink() {
        if (amount < 0){
            JOptionPane.showMessageDialog(null, "No hay pociones");
            throw new IllegalArgumentException();
        }
        else {
            JOptionPane.showMessageDialog(null, "Recuperas salud");
            amount--;
        }
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {//toString para diferente para Potion y Elixir
        return "ID: " + id + ", " + name + ", nivel: " + level + "\nTipo: " + type + ", cantidad: " + amount + '\n' + description;
    }
}
