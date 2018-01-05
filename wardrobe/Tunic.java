package com.wardrobe;

public class Tunic extends Shirt {
    //for matching:
    boolean longTunic; //if true, tunic is "warm"

    public Tunic(boolean patterned, int comfortLevel, int professionalLevel,
                   String colour, boolean longBool) {
        super(patterned, comfortLevel, professionalLevel, colour, longBool); //pass longBool as super's warmth attribute
        this.longTunic = longBool;
    }
    @Override
    public String toString(){
        return "A "+colour+" tunic"+longToString()+" with a "+patternString()+" design. "+
                comfortString()+professionalToString();
    }

    private String longToString(){
        if (longTunic)
            return " dress";
        else
            return "";
    }
}
