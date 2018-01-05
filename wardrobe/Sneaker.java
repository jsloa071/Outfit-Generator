package com.wardrobe;

import java.lang.annotation.Inherited;

public class Sneaker extends ClosedToe {
    //for description:
    String brand;

    public Sneaker(boolean pattern, String colour, int proLevel, boolean laced, String brand){
        super(pattern,colour, proLevel, laced);
        this.brand = brand;
    }
    @Override
    public String toString(){
        return "A "+colour+" pair of"+patternToString()+laceToString()+"sneakers made by "+brand+
                ". " + professionalToString();
    }
    @Override
    public String professionalToString(){
        if(professionalLevel > 3)
            return "These are classy sneakers that are perfect for any business function. ";
        else if(professionalLevel > 1)
            return "Goes well with most outfits, but not suitable for formal events. ";
        else
            return "Please don't ruin a good outfit with these. ";
    }
    @Override
    public boolean isFancy() { return false; }
}
