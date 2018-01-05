package com.wardrobe;

public class Cardigan extends Outerwear {
    public Cardigan(String colour) {
        super(colour, false);
    }

    public String toString() {
        return "A "+colour+ " cardigan. Complements any outfit, but not built for warmth.";
    }
}
