package com.wardrobe;

public abstract class Clothing implements Stylish {
    //Includes Pants and Shirts

    //for description:
    int comfortLevel; //between 1 and 5 - 1 being the least comfortable(fancy blouses) and 5 being the most(sweater)

    //for style matching:
    boolean patterned; //if patterned = bolder style, if not = solid (classy, neutral-lovers)
    int professionalLevel; //between 1 and 5 - 1 denotes clothing that you can't wear to work/more formal places,
                            // 5 denotes clothing that is appropriate for business functions
    String colour;

    public Clothing(boolean patterned, int comfortLevel, int professionalLevel, String colour){
        this.patterned = patterned;
        this.comfortLevel = comfortLevel;
        this.professionalLevel = professionalLevel;
        this.colour = colour;
    }

    @Override
    public abstract String toString();

    protected String patternString(){
        if (patterned)
            return "patterned";
        else
            return "solid";
    }

    protected String comfortString(){
        if (comfortLevel >4)
            return "Perfect for people who prioritize comfort over all else. ";
        else if (comfortLevel > 2)
            return "Perfect for people who value comfort, but also want to look good. ";
        else
            return "Perfect for people who sacrifice comfort to always look the best. ";
    }

    protected String professionalToString(){
        if (professionalLevel > 4)
            return "It is a fancier piece, best worn at business functions and dressier occasions. ";
        else if (professionalLevel > 2)
            return "It is a versatile piece that can be worn at work, school, or play. ";
        else if (professionalLevel > 1)
            return "It is not appropriate for most workplaces and dressier occasions, but you can get away with "+
                    "wearing it just about anywhere else. ";
        else
            return "You probably shouldn't wear it further than the end of your driveway, but to each their own. ";
    }

    @Override
    public boolean isFancy(){
        return (professionalLevel > 4);
    }
    @Override
    public boolean isPatterned(){
        return (patterned);
    }
    @Override
    public boolean goesWithGreen(){
        return (colour != "blue" && colour != "red");
    }
    @Override
    public boolean isGreen() {
        return (colour == "green");
    }
    public boolean goesWithTie(){
        return true;
    }
    @Override
    public boolean isWarm() { return false; }

}
