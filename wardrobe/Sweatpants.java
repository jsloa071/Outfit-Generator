package com.wardrobe;

public class Sweatpants extends Bottoms{
    //for description:
    String material; //spandex, fleece, cotton, etc...

    public Sweatpants(boolean patterned, int comfortLevel, int professionalLevel,
                 String colour, String material, boolean fullLeg) {
        super(patterned, comfortLevel, professionalLevel, colour, null, fullLeg);
        this.material = material;
    }
    @Override
    public String toString(){
        return "A "+colour+" pair of sweat"+legLengthToString()+ "with a "+patternString()+
                " design made out of "+material+". "+comfortString();
    }
    //Sweatpants are always comfy and never professional
    public String comfortString(){
        return "You can't get any comfier than this. ";
    }
    @Override
    public String legLengthToString() {
        if (fullLeg)
            return " pants ";
        else
            return " shorts ";
    }
    @Override
    public boolean goesWithTie() {
        return false;
    }
    @Override
    public boolean isFancy() { return false; }
}
