package com.wardrobe;

public class Jeans extends Bottoms {

    public Jeans(boolean patterned, int comfortLevel, int professionalLevel,
                 String colour, String style, boolean fullLeg) {
        super(patterned, comfortLevel, professionalLevel, colour, style, fullLeg);
    }
    @Override
    public String toString(){
        return "A "+colour+" pair of "+style+" jean"+legLengthToString()+"with a "+patternString()+" design. "+
                comfortString()+professionalToString();
    }
    @Override
    public String legLengthToString() {
        if (fullLeg)
            return " pants ";
        else
            return " shorts ";
    }
    @Override
    public boolean goesWithTie(){
        return false;
    }
}
