package com.DARP.x00026919;

abstract class ReuseableItem extends Item{
    protected int remainingUses;

    public ReuseableItem(String name, int weight, String description) {
        super(name, weight, description);
    }

    public void reduceUsed(){

    }

    public boolean use(){//Sin funcionalidad por el momento
        boolean flag = true;
        return flag;
    }
}
