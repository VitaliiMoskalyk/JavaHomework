package com.pb.moskalik.hw6;

public class VetСlinic extends Veterinarian{
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.name = "Archibald";
        horse.setFood("Grass");
        horse.setLocation("Field");

        Dog dog = new Dog();
        dog.name = "Sharik";
        dog.setFood("Meat");
        dog.setLocation("Street");

        Dog puppy = new Dog();
        puppy.name = "Gosha";
        puppy.setFood("Cucumbers");
        puppy.setLocation("Flat");

        Cat cat = new Cat();
        cat.name = "Murchik";
        cat.setFood("Milk");
        cat.setLocation("Flat");

        Animal[] animal = new Animal[]{horse, dog, cat, puppy};

        horse.eat();
        animal[1].makeNoise();
        cat.sleep();

        System.out.println("------------------------------------------");
        System.out.println("Equals dog and puppy: " + dog.equals(puppy));
        System.out.println("Equals dog and horse: " + dog.equals(horse));

        System.out.println("------------------------------------------");
        System.out.println("hashCode horse and cat: " + animal[0].hashCode() + ", " + animal[2].hashCode());
        System.out.println("hashCode dog and puppy: " + animal[1].hashCode() + " ," + animal[3].hashCode());


        System.out.println("------------------------------------------");
        System.out.println(animal[0].toString());
        System.out.println(animal[1]);
        System.out.println(cat);
        System.out.println(animal[3]);

        System.out.println("------------------------------------------");

        for (Animal a : animal) {
            treatAnimal(a);

        }


    }
}
