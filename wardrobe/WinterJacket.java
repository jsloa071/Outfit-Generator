package com.wardrobe;

public class WinterJacket extends Outerwear {
    public WinterJacket(String colour) {
        super(colour, true);
    }

    public String toString() {
        return "A "+colour+" winter jacket. Great for those cold winter mornings!";
    }
}
