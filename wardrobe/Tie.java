package com.wardrobe;

public class Tie extends Accessory{
    //for description:
    boolean clipOn;

    //for matching:
    boolean patterned;
    String colour;

    public Tie(String material, int professionalLevel, boolean clipOn, boolean pattern, String colour){
        super(material, professionalLevel);
        this.clipOn = clipOn;
        this.patterned = pattern;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "A "+colour+patternToString()+clipOnToString()+"tie made from "+material+". " + professionalLevelToString();
    }

    public String patternToString(){
        if(patterned)
            return " patterned";
        else
            return " solid";
    }

    public String clipOnToString(){
        if(clipOn)
            return" clip-on ";
        else
            return " ";
    }
    @Override
    public String professionalLevelToString(){
        if(professionalLevel > 4)
            return "Perfect for all business functions and formal events. ";
        else
            return "Great for work or parties, but not advisable to wear to formal events. ";
    }
    @Override
    public boolean isPatterned(){
        return patterned;
    }
    @Override
    public boolean goesWithGreen(){
        return (colour != "red" && colour == "blue");
    }
}
