package com.wardrobe;

public abstract class ClosedToe extends Shoes {
    //for description:
    boolean laceUp;

    public ClosedToe(boolean pattern, String colour, int proLevel, boolean laceUp){
        super(pattern,colour, proLevel);
        this.laceUp = laceUp;
        this.warm = true;
    }

    @Override
    public abstract String toString();

    public String laceToString(){
        if (laceUp)
            return "lace-up ";
        else
            return "slip-on ";
    }

    @Override
    public boolean isWarm() {
        return true;
    }
}
