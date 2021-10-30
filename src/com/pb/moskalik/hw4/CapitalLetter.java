package com.pb.moskalik.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static String firstLetterToUpperCase(String str){
        String stringToUpperWords = "";
        for(String words: str.split("\\s")){
            stringToUpperWords=stringToUpperWords + words.substring(0,1).toUpperCase()+words.substring(1)+" ";
        }
        return stringToUpperWords;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        scan.useDelimiter("\\Z");
        System.out.println("Write a message, please:");
        String userString=scan.nextLine();

        System.out.println(firstLetterToUpperCase(userString));

    }
}
