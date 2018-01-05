package com.wardrobe;

public abstract class Shirt extends Clothing{
    //for matching:
    boolean warm;

    public Shirt(boolean patterned, int comfortLevel, int professionalLevel, String colour, boolean warmth){
        super(patterned,comfortLevel,professionalLevel,colour);
        this.warm = warmth;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean isWarm() {
        return (warm);
    }

}
