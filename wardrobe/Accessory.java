package com.wardrobe;

public abstract class Accessory implements Stylish {
    //for descriptions:
    String material;
    //for style matching:
    int professionalLevel;

    public Accessory(String material, int professionalLevel){
        this.material = material;
        this.professionalLevel = professionalLevel;
    }

    public abstract String toString();

    public abstract String professionalLevelToString();

    @Override
    public boolean isFancy(){
        return (professionalLevel > 4);
    }
    @Override
    public boolean isPatterned() {
        return false;
    }
    @Override
    public boolean goesWithGreen(){
        return true;
    }
    @Override
    public boolean isGreen() {
        return false;
    }
    @Override
    public boolean isWarm() { return true; }
}
