package com.wardrobe;

public class Necklace extends Accessory{
    //for description:
    String jewel;

    public Necklace(String material, int professionalLevel, String jewel){
        super(material,professionalLevel);
        this.jewel = jewel;
    }

    @Override
    public String toString() {
        return "A "+material+" necklace "+" with "+jewel+" features. " + professionalLevelToString();
    }
    @Override
    public String professionalLevelToString(){
        if(professionalLevel > 3)
            return "Perfect for all business functions and formal events. ";
        else
            return "Great for work or parties, but not advisable to wear to formal events. ";
    }
}
