package com.wardrobe;

public class HighHeel extends OpenToed {
    //for description:
    String designer;

    public HighHeel(boolean pattern, String colour, int proLevel, String designer){
        super(pattern,colour,proLevel);
        this.designer = designer;
    }

    @Override
    public String toString(){
        return "A "+colour+" pair of"+patternToString()+designer+" open-toed high heels. "+professionalToString();
    }

    @Override
    public String professionalToString(){
        if (professionalLevel > 4)
            return "Perfect for any business or formal events. ";
        else if (professionalLevel > 1)
            return "Goes well with most outfits, but not suitable for formal events. ";
        else
            return "Doesn't go well with anything, but if you like to wear heels to run errands, be my guest.";
    }
}
