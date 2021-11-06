package com.pb.moskalik.hw6;

public class Animal {
    protected String name;
    private String food;
    private String location;


    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        System.out.println(name+": aaaaaapchiiiii");
    }

    public void eat(){
        System.out.println(name+": amnomomomomomom");
    }

    public void sleep(){
        System.out.println(name+": hrhhhrrrrhrhrh");
    }
}
