package com.pb.moskalik.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String saddle="saddle";
    private String hoof="hoof";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(saddle, horse.saddle) && Objects.equals(hoof, horse.hoof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saddle, hoof);
    }

    @Override
    public String toString() {
        return "Horse with " +
                saddle + " and "+
                hoof
                ;
    }
}
