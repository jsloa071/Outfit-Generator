package com.wardrobe;

import java.util.ArrayList;

public class Wardrobe {

    public ArrayList<Shirt> shirts;
    public ArrayList<Bottoms> bottoms;
    public ArrayList<Accessory> accessories;
    public ArrayList<Shoes> shoes;
    public ArrayList<Outerwear> outerwear;

    public Wardrobe(){
        shirts = new ArrayList<>();
        bottoms = new ArrayList<>();
        accessories = new ArrayList<>();
        shoes = new ArrayList<>();
        outerwear = new ArrayList<>();
    }

    public void getSampleWardrobe(){
        //String attribute options
        String[] colors = {"red", "pink", "green", "orange", "blue", "white", "beige", "grey", "black"};
        String[] fabrics = {"cotton", "polyester", "satin", "silk", "cashmere", "spandex"};
        String[] styles = {"bootcut", "straight-leg", "skinny", "flare"}; //for pants
        String[] skirtStyles = {"A-Line", "pencil", "maxi"};
        String[] jewelryMaterials = {"gold", "silver", "rose gold", "platinum"};
        String[] jewels = {"diamond", "pearl", "rhinestone" , "ruby"};
        String[] watchCrafters = {"Rolex", "American", "Swiss"};
        String[] shoeBrands = {"Nike", "Adidas", "New Balance", "Joe Fresh", "American Eagle", "Gucci", "Jimmy Choo"};

        //create 15 random shirts to fill in wardrobe
        for(int i=0; i<15; i++){
            //4 sweaters
            if (i > 10)
                shirts.add(new Sweater((Math.random() < 0.5), //random boolean for pattern
                                 ((int) (Math.random()*5)+1), // random integer between 1-5 for comfort level
                                ((int) (Math.random()*3)+1), // random integer between 1-5 for professional level
                                                            //but sweaters are never very professional - range is 1-3
                        (colors[(int) (Math.random()*9)]), //random color
                        (Math.random() < 0.5), (Math.random() < 0.5), (Math.random() < 0.5) )); //random bools
            //5 blouses
            else if(i > 5)
                shirts.add(new Blouse((Math.random() < 0.5), ((int) (Math.random()*5)+1),
                        ((int) (Math.random()*3)+3),            //blouses tend to be professional, so range is 3-5
                        (colors[(int) (Math.random()*9)]),
                        (Math.random() < 0.5),
                        (fabrics[(int) (Math.random()*5)]), //random fabric, but not spandex
                        (Math.random() < 0.5)));
            //4 t-shirts
            else if(i > 1)
                shirts.add(new Tshirt((Math.random() < 0.5), ((int) (Math.random()*5)+1),
                        ((int) (Math.random()*4)+1),           //tshirts are never a '5' professional level
                        (colors[(int) (Math.random()*9)]),
                        (Math.random() < 0.5), (Math.random() < 0.5)));

            //2 tunics
            else
                shirts.add(new Tunic((Math.random() < 0.5), ((int) (Math.random()*5)+1),
                        ((int) (Math.random()*5)+1),
                        colors[(int) (Math.random()*9)],
                        (Math.random() < 0.5)));
        }

        //create 15 random bottoms to fill in wardrobe
        for(int i=0; i<15; i++){
            //5 jeans
            if (i > 9)
                bottoms.add(new Jeans((Math.random() < 0.5), //random boolean for pattern
                        ((int) (Math.random()*5)+1), // random integer between 1-5 for comfort level
                        ((int) (Math.random()*4)+1), // random integer between 1-4 for professional level
                        (colors[(int) (Math.random()*9)]), //random color
                        (styles[(int) (Math.random()*4)]), //random style)
                        (Math.random() < 0.5))); //random bool for leg length
                //4 skirts
            else if(i > 5)
                bottoms.add(new Skirt((Math.random() < 0.5),
                        ((int) (Math.random()*5)+1),
                        ((int) (Math.random()*3)+3),            //skirts tend to be professional, so range is 3-5
                        (colors[(int) (Math.random()*9)]),
                        (skirtStyles[(int) (Math.random()*3)]),
                        (Math.random() < 0.5)));
                //4 dress pants
            else if(i > 1)
                bottoms.add(new DressPants((Math.random() < 0.5),
                        ((int) (Math.random()*5)+1),5,
                        (colors[(int) (Math.random()*4)+5]), //colors are neutrals (index between 5-8)
                        styles[(int) (Math.random()*4)],
                        (Math.random() < 0.5)));

                //2 sweatpants
            else
                bottoms.add(new Sweatpants((Math.random() < 0.5),
                        ((int) (Math.random()*5)+1),
                        ((int) (Math.random()*2)+1),
                        (colors[(int) (Math.random()*9)]),
                        fabrics[(int) (Math.random()*6)],
                        (Math.random() < 0.5)));
        }
        //create 15 random accessories to fill in wardrobe
        for(int i=0; i<15; i++){
            //5 ties
            if (i > 9)
                accessories.add(new Tie(fabrics[(int) (Math.random()*6)], //random boolean for pattern
                        ((int) (Math.random()*2)+3), // random integer between 3-5 for professional level
                        (Math.random() < 0.5),       // clip-on (bool)
                        (Math.random() < 0.5),      // pattern (bool)
                        (colors[(int) (Math.random()*9)]))); //random bool for leg length
                // 5 necklaces
            else if(i > 4)
                accessories.add(new Necklace(jewelryMaterials[(int) (Math.random()*4)],
                        ((int) (Math.random()*5)),
                        jewels[(int) (Math.random()*4)]));
                //5 watches
            else
                accessories.add(new Watch(jewelryMaterials[(int) (Math.random() *4)],
                        ((int) (Math.random()*6)),
                        (watchCrafters[(int) (Math.random()*3)]),
                        (Math.random() < 0.5)));
        }

        //create 15 random shoes to fill in wardrobe
        for(int i=0; i<15; i++){
            //4 dress shoes
            if (i > 10)
                shoes.add(new DressShoes((Math.random() < 0.5), //random boolean for pattern
                        (colors[(int) (Math.random()*9)]),
                        ((int) (Math.random()*2)+3), // random integer between 3-5 for professional level
                        (Math.random() < 0.5)));       // lace-up (bool)
                // 5 sneakers
            else if (i > 5)
                shoes.add(new Sneaker((Math.random() < 0.5), //random boolean for pattern
                        (colors[(int) (Math.random()*9)]),
                        ((int) (Math.random()*3)), // random integer between 1-3 for professional level
                        (Math.random() < 0.5),
                        (shoeBrands[(int) (Math.random()*5)]))); // one of the non-designer brands
                //3 high heels
            else if (i > 2)
                shoes.add(new HighHeel((Math.random() < 0.5),
                        (colors[(int) (Math.random()*9)]),
                        ((int) (Math.random()*2)+3),            //tends to be professional
                        (shoeBrands[(int) (Math.random()*4)+3]))); //one of the non-athletic brands
                //flats
            else
                shoes.add(new Flat((Math.random() < 0.5),
                        (colors[(int) (Math.random()*9)]),
                        (int) (Math.random()*5)));
        }

        //create 5 random outerwear pieces
        for (int i=0; i<5; i++) {
            // 1 rain jacket
            if (i > 3)
                outerwear.add(new Raincoat(colors[(int) (Math.random() * 9)]));
            //2 cardigans
            else if (i > 1)
                outerwear.add(new Cardigan(colors[(int) (Math.random() * 9)]));
            //2 winter jackets
            else
                outerwear.add(new WinterJacket(colors[(int) (Math.random() * 9)]));
        }

    }
}
