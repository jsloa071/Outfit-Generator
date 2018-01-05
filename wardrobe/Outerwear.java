package com.wardrobe;

public abstract class Outerwear implements Stylish {
    //for matching:
    String colour;
    boolean warm;

    public Outerwear(String colour, boolean warmth) {
        this.colour = colour;
        this.warm = warmth;
    }

    public abstract String toString();

    @Override
    public boolean isFancy(){ return true; }
    @Override
    public boolean isPatterned(){
        return false;
    }
    @Override
    public boolean goesWithGreen(){
        return (colour != "blue" && colour != "red");
    }
    @Override
    public boolean isGreen() {
        return (colour == "green");
    }
    @Override
    public boolean isWarm() { return (warm); }
}
