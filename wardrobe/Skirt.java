package com.wardrobe;

public class Skirt extends Bottoms {
    public Skirt(boolean patterned, int comfortLevel, int professionalLevel,
                 String colour, String style, boolean fullLeg) {
        super(patterned, comfortLevel, professionalLevel, colour, style, fullLeg);
    }
    @Override
    public String toString(){
        return "A"+legLengthToString()+colour+" "+style+" skirt with a "+patternString()+" design. "+
                comfortString()+professionalToString();
    }
    @Override
    public String legLengthToString() {
        if (fullLeg)
            return " long, ";
        else
            return " mid-length, ";
    }

}
