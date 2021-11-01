package com.pb.moskalik.hw5;

public class Reader {
    private String readerName;
    private int numberID;
    private String userDepartment;
    private String dateOfBirthday;
    private String phoneNumber;

public void setStudentNameBirhday(String readerName,String dateOfBirthday){
    this.readerName=readerName;
    this.dateOfBirthday=dateOfBirthday;
}

    public void setStudentData(int numberID,String userDepartment,String phoneNumber){
        this.numberID=numberID;
        this.userDepartment=userDepartment;
        this.phoneNumber=phoneNumber;
    }

    public String getName(){

    return this.readerName;
    }

    public void  takeBook(String ...titles){
    System.out.println("Student "+readerName+" get : ");
    for(String title:titles) System.out.println(title+", ");
        System.out.println(" ");
    }

    public void  takeBook(int count){
        System.out.println("Student "+readerName+" get " + count+" books");
        System.out.println(" ");
    }
    public void  takeBook(Book...books) {
        System.out.println("Student " + readerName + " get :");
        for (Book book : books) System.out.println(book.title + " ( " + book.author + ", " + book.year + " ) " + ", ");
        System.out.println(" ");
    }

    public void  returnBook(int count){
        System.out.println("Student "+readerName+" return " + count+" books");
        System.out.println(" ");
    }
    public void returnBook(String ...titles){
        System.out.println("Student "+readerName+" return: ");
        for(String title:titles) System.out.println(title+", ");
        System.out.println(" ");
    }
    public void  returnBook(Book...books) {
        System.out.println("Student " + readerName + " return :");
        for (Book book : books) System.out.println(book.title + " ( " + book.author + ", " + book.year + " ) " + ", ");
        System.out.println(" ");
    }
}
