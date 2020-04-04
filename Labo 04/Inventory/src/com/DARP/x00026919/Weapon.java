package com.DARP.x00026919;

public class Weapon extends ReuseableItem{
    private String type, wieldType;
    private int level;
    private double speed, damage;

    public Weapon(String name, int weight, String description, String type, String wieldType){
        super(name, weight, description);
        this.type = type;
        this.wieldType = wieldType;
        level = 1;
    }

    public void upgrade(){

    }

    public String getType() {
        return type;
    }
}
