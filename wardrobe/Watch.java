package com.wardrobe;

public class Watch extends Accessory {
    //for description:
    String crafter;
    boolean digital;


    public Watch(String material, int professionalLevel, String crafter, boolean digital){
        super(material,professionalLevel);
        this.crafter = crafter;
        this.digital = digital;
    }

    @Override
    public String toString() {
        return"A "+material+" "+crafter+digitalToString()+"watch. " + professionalLevelToString();
    }

    public String digitalToString() {
        if(digital)
            return" digital ";
        else
            return " analog ";
    }
    @Override
    public String professionalLevelToString(){
        if(professionalLevel > 4)
            return "Perfect for all business functions and formal events. ";
        else if (professionalLevel > 2)
            return "Great for work or parties, but not advisable to wear to formal events. ";
        else
            return "Usually worn for its ability to tell the time rather than its style. ";
    }
}
