package com.pb.moskalik.hw5;

import com.pb.moskalik.hw3.Array;

public class Library {
    public static void main(String[] args) {
// Create new books with setBook
        Book book1=new Book();
        Book book2=new Book();
        Book book3=new Book();

        book1.setBook("Scotish Tales","Henry Crowd",1996);
        book2.setBook("Electronics","Endy Watt",2016);
        book3.setBook("Filosofy","Hanna Glue",2010);

        System.out.println("Now in Library: "+book1.title+", "+book2.title+", "+book3.title);
        System.out.println(" ");
 // Create students
        Reader reader1=new Reader();
        Reader reader2=new Reader();
        Reader reader3=new Reader();

        reader1.setStudentNameBirhday("Ivan Petrov","18-06-1987");
        reader1.setStudentData(14256,"UOLF","3805632145");

        reader2.setStudentNameBirhday("Petr Fock","10-01-1990");
        reader2.setStudentData(23654,"PLKI","389642536");

        reader3.setStudentNameBirhday("John Hill","01-12-2000");
        reader3.setStudentData(10236,"PPLO","385620001");

        System.out.println("Students in Library: "+reader1.getName()+", "+reader2.getName()+", "+reader3.getName());
        System.out.println(" ");
  //////////////////////////////////////////////////////////////////////////////////////////////////////////

        reader2.takeBook(2);
        reader1.takeBook("Scotish Tales","Filosofy");
        reader2.takeBook(book3,book2,book1);

        reader3.returnBook(3);
        reader1.returnBook("Scotish Tales","Filosofy");
        reader2.returnBook(book2,book1);
    }
}
