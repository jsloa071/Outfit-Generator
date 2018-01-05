package com.wardrobe;

public class Main {

    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        wardrobe.getSampleWardrobe();

        System.out.println("The wardrobe consists of the following items:");
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("Tops: ");
        for(Clothing shirt : wardrobe.shirts){
            System.out.println(shirt.toString());
        }

        System.out.println();
        System.out.println("Bottoms:");
        for(Clothing bottom : wardrobe.bottoms){
            System.out.println(bottom.toString());
        }

        System.out.println();
        System.out.println("Accessories:");
        for(Accessory acc : wardrobe.accessories){
            System.out.println(acc.toString());
        }

        System.out.println();
        System.out.println("Shoes:");
        for(Shoes shoe : wardrobe.shoes) {
            System.out.println(shoe.toString());
        }

        System.out.println();
        System.out.println("Outerwear:");
        for(Outerwear item : wardrobe.outerwear) {
            System.out.println(item.toString());
        }
        System.out.println("+---------------------------------------------------------------------------------------+");

        System.out.println("Finding the perfect outfit.... \n");

        OutfitGenerator generator = new OutfitGenerator();
        generator.generateRandomOutfit();


    }
}
