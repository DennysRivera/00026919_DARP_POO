package com.DARP.x00026919;

public class Ammo extends ReuseableItem{
    private boolean equipped;

    public Ammo(String name, int weight, String description, int remaingUses) {
        super(name, weight, description);
        this.remainingUses = remaingUses;
    }

    public int getRemainingUses(){
        return remainingUses;
    }

    public void equip(){

    }
}
