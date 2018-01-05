package com.wardrobe;

public class Flat extends OpenToed{
    public Flat(boolean pattern, String colour, int proLevel){
        super(pattern,colour,proLevel);
    }

    @Override
    public String toString(){
        return "A "+colour+" pair of"+patternToString()+"open-toed flats. "+professionalToString();
    }

    @Override
    public String professionalToString(){
        if (professionalLevel > 3)
            return "Perfect for any business or formal event. ";
        else if (professionalLevel > 1)
            return "Suitable for most outfits, whether for work or for play. ";
        else
            return "Should only be worn while running errands on laundry day. ";
    }
}
