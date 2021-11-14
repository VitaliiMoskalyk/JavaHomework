package com.pb.moskalik.hw7;

import java.util.Arrays;

public class Atelier {
    public static void main(String[] args) {
        Tshirt tshirt= new Tshirt();
        tshirt.size=Size.S;
        tshirt.price=1500;
        tshirt.color=" синий";

        Pants pants= new Pants();
        pants.size=Size.XS;
        pants.price=2000;
        pants.color=" белый";

        Skirt skirt= new Skirt();
        skirt.size=Size.M;
        skirt.price=750;
        skirt.color=" желтый";

        Tie tie= new Tie();
        tie.size=Size.XXS;
        tie.price=350;
        tie.color=" пурпурный";

        Clothes[] clothes={tie,skirt,pants,tshirt};
//
        dressMan(clothes);
        dressWomen(clothes);
    }
    public static void dressMan(Clothes[] clothes){
        System.out.println("Мужская одежда: ");
        for (Clothes clothe:clothes)
       if (clothe instanceof ManClothes){
           System.out.println(clothe.getClass().getSimpleName()+": "+clothe.size.toString()+clothe.color+": "+clothe.price+" кредитов");
       }

    }
    public static void dressWomen(Clothes[] clothes){
        System.out.println("Женская одежда: ");
        for (Clothes clothe:clothes)
            if (clothe instanceof WomenClothes){
                System.out.println(clothe.getClass().getSimpleName()+": "+clothe.size.toString()+clothe.color+": "+clothe.price+" кредитов");
            }
    }
}

