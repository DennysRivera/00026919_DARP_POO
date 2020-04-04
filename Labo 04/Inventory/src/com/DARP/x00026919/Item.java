package com.DARP.x00026919;

abstract class Item {
    protected int id, weight;
    protected String name, description;

    public Item(){
        id = Idgenerator.newId(); //Para Potion y Elixir, donde no utilizo weight
    }
    public Item(String name, int weight, String description){
        this.name = name;
        this.weight = weight;
        this.description = description;
        id = Idgenerator.newId();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + name + ", peso: " + weight + '\n' + description;
    }

    public int getId() {
        return id;
    }
}
