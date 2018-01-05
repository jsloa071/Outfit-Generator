package com.wardrobe;

public class Blouse extends Shirt{
    //for descriptions:
    String fabric; //silk, cotton, polyester, etc...
    boolean buttoned;

    public Blouse(boolean patterned, int comfortLevel, int professionalLevel,
                  String colour,boolean shortSleeved, String fabric, boolean buttoned) {
        super(patterned, comfortLevel, professionalLevel, colour, shortSleeved);
        this.fabric = fabric;
        this.buttoned = buttoned;
    }
    @Override
    public String toString(){
        return "A "+colour+" "+fabric+" "+buttonedToString()+" blouse with a "+patternString()+" design. "+
                comfortString()+ professionalToString();
    }

    private String buttonedToString(){
        if (buttoned)
            return "buttoned";
        else
            return "";
    }
}
