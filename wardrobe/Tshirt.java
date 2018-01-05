package com.wardrobe;

public class Tshirt extends Shirt {
    //for description:
    boolean vNeck;

    public Tshirt(boolean patterned, int comfortLevel, int professionalLevel,
                  String colour, boolean shortSleeved, boolean vNeck) {
        super(patterned, comfortLevel, professionalLevel, colour, shortSleeved);
        this.vNeck=vNeck;
    }
    @Override
    public String toString(){
        return "A "+colour+" "+vNeckToString()+" t-shirt with a "+patternString()+" design. "+comfortString()+professionalToString();
    }

    private String vNeckToString(){
        if (vNeck)
            return "v-neck";
        else
            return "scoop-neck";
    }
}
