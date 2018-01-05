package com.wardrobe;

public abstract class OpenToed extends Shoes {

    public OpenToed(boolean pattern, String colour, int proLevel){
        super(pattern,colour, proLevel);
        this.warm = false;
    }
    @Override
    public abstract String toString();

    @Override
    public boolean isWarm() { return false; }

}
