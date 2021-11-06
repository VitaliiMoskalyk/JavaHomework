package com.pb.moskalik.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String bone="bone";
    private String collar="collar";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(bone, dog.bone) && Objects.equals(collar, dog.collar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bone, collar);
    }

    @Override
    public String toString() {
        return "Dog with " +
                 bone + " and "+
                 collar
                ;
    }
}
