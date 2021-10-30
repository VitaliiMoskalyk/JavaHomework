package com.pb.moskalik.hw4;

import com.pb.moskalik.hw3.Array;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    static String alfabetSort(String strng) {

        char[] charArray = strng.toCharArray();
       char arr;

            boolean isSorted=false;

            while(!isSorted){
                isSorted=true;
                for(int i=0;i<charArray.length-1;i++){
                    if(charArray[i]>charArray[i+1]) {
                        isSorted=false;
                        arr=charArray[i];
                        charArray[i]=charArray[i+1];
                        charArray[i+1]=arr;
                    }
                }
            }

        return String.valueOf(charArray);
    }

    static String checkingTwoStrings(String str1,String str2){
        String arr1=str1.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "").toLowerCase();
        String arr2=str2.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "").toLowerCase();
        String message="";
        char[] charArray1=alfabetSort(arr1).toCharArray();
        char[] charArray2=alfabetSort(arr2).toCharArray();

        if(arr1.length()!=arr2.length()){
            System.out.println("This is NOT ANAGRAMM");
        }
        else{
        for(int i=0;i<charArray1.length;i++){
            if(charArray1[i]==charArray2[i]){
                message="This is ANAGRAMM";
            }
            else{
                 message="This is NOT ANAGRAMM";
            }

        }}
        System.out.println(message);
return message;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        System.out.println("Write a first string, please:");
        String userString1 = scan.nextLine();

        System.out.println("Write a second string, please:");
        String userString2 = scan.nextLine();



            checkingTwoStrings(userString1,userString2);

    }
}
