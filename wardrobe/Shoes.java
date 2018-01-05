package com.wardrobe;

public abstract class Shoes implements Stylish {
    //for matching:
    boolean patterned;
    String colour;
    int professionalLevel;
    boolean warm; //"warm" means good for winter outfits

    public Shoes(boolean pattern, String colour, int professionalLevel){
        this.patterned = pattern;
        this.colour = colour;
        this.professionalLevel = professionalLevel;
    }

    public abstract String toString();

    public String patternToString(){
        if(patterned)
            return " patterned ";
        else
            return " solid-coloured ";
    }

    public abstract String professionalToString();

    public boolean goesWithTie() {
        return true;
    }

    @Override
    public boolean goesWithGreen() {
        return (colour != "red" && colour != "blue");
    }
    @Override
    public boolean isGreen(){
        return (colour == "green");
    }
    @Override
    public boolean isFancy() {
        return (professionalLevel > 4);
    }
    @Override
    public boolean isPatterned() {
        return patterned;
    }
    @Override
    public boolean isWarm() {
        return false;
    }
}
