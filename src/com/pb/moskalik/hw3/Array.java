package com.pb.moskalik.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int []array=new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.println("Set arrays "+array.length+" elements");

        int total=0;
        int totalPos=0;
        int arr;

        for(int j=0;j<array.length-1;j++){
            array[j] = scan.nextInt();
            total=total+array[j];
            if (array[j]>0)totalPos+=array[j];
        }

        System.out.println("Your array is "+Arrays.toString(array));
        System.out.println("Total counts of array is "+total);
        System.out.println("Total POSITIVE counts of array is "+totalPos);

        boolean isSorted=false;

        while(!isSorted){
            isSorted=true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]) {
                isSorted=false;
                arr=array[i];
                array[i]=array[i+1];
                array[i+1]=arr;
            }
        }
        }
        System.out.println("Bubble sorted array  "+Arrays.toString(array));
    }

}
