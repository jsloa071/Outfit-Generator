package com.wardrobe;

public class DressPants extends Bottoms{

    public DressPants(boolean patterned, int comfortLevel, int professionalLevel,
                 String colour, String style, boolean fullLeg) {
        super(patterned, comfortLevel, professionalLevel, colour, style, fullLeg);
    }
    @Override
    public String toString(){
        return "A "+colour+" pair of "+style+" dress"+legLengthToString()+ "a "+patternString()+" design. "+
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
    public boolean isFancy() { return true; }

}

