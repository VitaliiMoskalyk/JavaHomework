package com.pb.moskalik.hw6;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Veterinarian {
    public static void treatAnimal(Animal animal) {
        Class clazz=animal.getClass();
//        System.out.println(clazz.getName());
//        System.out.println(Arrays.toString(clazz.getMethods()));

//        Class animalClazz=Class.forName("hw6.Animal");
//        Constructor constr=animalClazz.getConstructor(new Class[] {});
//        Object obj=constr.newInstance("Gosha");
//        if (obj instanceof Animal){
//            System.out.println((((Animal) obj)).getFood());
//            (((Animal) obj)).getLocation();
            System.out.println("Now treat "+clazz.getSimpleName()+", which eat "+ animal.getFood()+" and live in "+animal.getLocation());
//        }


    }

}
