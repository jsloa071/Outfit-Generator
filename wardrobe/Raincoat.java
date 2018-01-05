package com.wardrobe;

public class Raincoat extends Outerwear {
    public Raincoat(String colour) {
        super(colour, false);
    }

    public String toString() {
        return "A " +colour+ " rain jacket. Not very warm, but will help you out on rainy days.";
    }
}
