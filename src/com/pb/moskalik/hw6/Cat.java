package com.pb.moskalik.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private String whisker="whisker";
    private String claws="claws";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(whisker, cat.whisker) && Objects.equals(claws, cat.claws);
    }

    @Override
    public int hashCode() {
        return Objects.hash(whisker, claws);
    }

    @Override
    public String toString() {
        return "Cat with " +
                whisker + " and "+
                claws
                ;
    }
}
