package com.wardrobe;

import java.util.Random;

public class OutfitGenerator {
    Wardrobe wardrobe;
    Shirt shirt;
    Bottoms bottom;
    Shoes shoe;
    Accessory accessory;
    Outerwear outerwear;

    public OutfitGenerator(){
        wardrobe = new Wardrobe();
        wardrobe.getSampleWardrobe();
    }

    public void getRandomShirt(){
        Random Dice = new Random();
        int n = Dice.nextInt(wardrobe.shirts.size());
        shirt = wardrobe.shirts.get(n);
    }

    public void getRandomPants(){
        Random Dice = new Random();
        int n = Dice.nextInt(wardrobe.bottoms.size());
        bottom = wardrobe.bottoms.get(n);
    }

    public void getRandomShoe(){
        Random Dice = new Random();
        int n = Dice.nextInt(wardrobe.shoes.size());
        shoe = wardrobe.shoes.get(n);
    }

    public void getRandomAccessory(){
        Random Dice = new Random();
        int n = Dice.nextInt(wardrobe.accessories.size());
        accessory = wardrobe.accessories.get(n);
    }

    public void getRandomOuterwear(){
        Random Dice = new Random();
        int n = Dice.nextInt(wardrobe.outerwear.size());
        outerwear = wardrobe.outerwear.get(n);
    }

    public boolean colourMatches(){
        //shirt, bottom, shoes, accessory, and outerwear must all match colours
        if (shirt.isGreen() && !(bottom.goesWithGreen() && shoe.goesWithGreen() && accessory.goesWithGreen() && outerwear.goesWithGreen()) ||
                bottom.isGreen() && !(shirt.goesWithGreen() && shoe.goesWithGreen() && accessory.goesWithGreen() && outerwear.goesWithGreen()) ||
                accessory.isGreen() && !(shirt.goesWithGreen() && shoe.goesWithGreen() && bottom.goesWithGreen() && outerwear.goesWithGreen()) ||
                shoe.isGreen() && !(shirt.goesWithGreen() && bottom.goesWithGreen() && accessory.goesWithGreen() && outerwear.goesWithGreen() ||
                outerwear.isGreen() && !(shirt.goesWithGreen() && bottom.goesWithGreen() && accessory.goesWithGreen() && shoe.goesWithGreen()))) {
            System.out.println("The colours don't match. ");
            return false;
        }
        else
            return true;
    }

    public boolean tieMatches(){
        //tie must match with shirt, bottom, and shoes
        if ((accessory instanceof Tie) && !(shirt.goesWithTie() && bottom.goesWithTie() && shoe.goesWithTie())) {
            System.out.println("The tie does not match.");
            return false;
        }
        else
            return true;
    }

    public boolean fancyMatches(){
        //the base outfit (shirt, bottom, and shoe) must all match in terms of "fanciness"
        if ((shirt.isFancy() && bottom.isFancy() && shoe.isFancy()) ||
                (!shirt.isFancy() && !bottom.isFancy() && !shoe.isFancy()))
            return true;
        else{
            System.out.println("Fancy things don't go well with comfy things. ");
            return false;
        }
    }

    public boolean patternMatches(){
        //patterns for shirt, bottom, and shoe must match
        if (shirt.isPatterned() && bottom.isPatterned() && shoe.isPatterned()) {
            System.out.println("The outfit is too bland.");
            return false;
        }
        else if (!shirt.isPatterned() && !bottom.isPatterned() && !shoe.isPatterned()) {
            System.out.println("Too many patterns.");
            return false;
        }
        else
            return true;
    }

    public boolean warmMatches(){
        //if wearing a warm jacket --> shouldn't be wearing cooler layers (i.e. shorts, open-toed shoes)
        if ((outerwear.isWarm() && (!bottom.isWarm() || !shoe.isWarm()))) {
            System.out.println("The layers don't match the weather.");
            return false;
        }
        else
            return true;
    }

    public void generateRandomOutfit() {
        boolean match = false;
        while (!match) {
            getRandomShirt();
            getRandomPants();
            getRandomShoe();
            getRandomAccessory();
            getRandomOuterwear();
            printOutfit();

            if(colourMatches() && tieMatches() && fancyMatches() && patternMatches() && warmMatches())
                match = true;
            else {
                System.out.println("Bad combination! Let's try that again... ");
            }
            System.out.println();
        }
        System.out.println("The outfit generator has found the perfect outfit!");
        printOutfit();
    }

    public void printOutfit(){
        System.out.println(shirt);
        System.out.println(bottom);
        System.out.println(accessory);
        System.out.println(shoe);
        System.out.println(outerwear);
    }
}
