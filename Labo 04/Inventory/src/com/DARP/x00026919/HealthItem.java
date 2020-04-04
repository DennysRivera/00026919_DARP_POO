package com.DARP.x00026919;

abstract class HealthItem extends Item {
    protected int reuseTime;
    protected String level, type;

    public HealthItem(){
        super();
    }

    abstract void drink();

    public String getType(){
        return type;
    }

    public String getLevel(){
        return level;
    }

}
