package com.wardrobe;

public abstract class Bottoms extends Clothing {
    boolean fullLeg; //extends entire length of leg
    String style;

    public Bottoms(boolean patterned, int comfortLevel, int professionalLevel, String colour,String style, boolean fullLeg){
        super(patterned,comfortLevel,professionalLevel,colour);
        this.fullLeg = fullLeg;
        this.style = style;
    }

    public abstract String legLengthToString();

    @Override
    public abstract String toString();

    @Override
    public boolean isWarm() {
        return (fullLeg);
    }
}
