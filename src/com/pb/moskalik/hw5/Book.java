package com.pb.moskalik.hw5;

public class Book {
    public String title;
    public String author;
    public int year;



    public void setBook(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;

         System.out.println("New book: "+title+" "+author+" "+year+" is added to Library");

    }


}
