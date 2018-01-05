package com.wardrobe;

public class Sweater extends Shirt{
    //for description:
    boolean hooded;
    boolean pullOver;

    public Sweater(boolean patterned, int comfortLevel, int professionalLevel,
                   String colour, boolean warmth, boolean hooded, boolean pullOver) {
        super(patterned, comfortLevel, professionalLevel, colour,warmth);
        this.hooded=hooded;
        this.pullOver=pullOver;
    }
    @Override
    public String toString(){
        return "A "+colour+" "+pullOverToString()+hoodedToString()+" with a "+patternString()+" design. "+
                comfortString()+professionalToString();
    }

    private String hoodedToString(){
        if(hooded)
            return "hoodie";
        else
            return"sweater";
    }

    private String pullOverToString(){
        if(pullOver)
            return"pull-over ";
        else
            return"zip-up ";
    }
    @Override
    public boolean isFancy(){
        return false;
    }
    @Override
    public boolean goesWithTie() {
        return false;
    }
}
