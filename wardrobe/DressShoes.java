package com.wardrobe;

public class DressShoes extends ClosedToe {

    public DressShoes(boolean pattern, String colour, int proLevel, boolean laced){
        super(pattern,colour,proLevel,laced);
    }
    @Override
    public String toString(){
        return "A "+colour+" pair of"+patternToString()+laceToString()+"dress shoes. "+
                professionalToString();
    }
    @Override
    public String professionalToString()
    {
        return "Perfect for any business or formal event. ";
    }

    @Override
    public boolean isFancy(){ return true; }
}
