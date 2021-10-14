package com.pb.moskalik.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Hello, write please integer number from 0 to 100");
        Scanner scan=new Scanner(System.in);
        int x =scan.nextInt();

        if (x<=14 && x>=0) {
            System.out.println("Your number is 0 - 14 interval") ;
            return;
        }
        if (x>=15 && x<=36){
            System.out.println("Your number is 15 - 36 interval");
            return;
        }
        if (x>=37 && x<=50){
            System.out.println("Your number is 37 - 50 interval");
            return;
        }
        if (x>=51 && x<=100) {
            System.out.println("Your number is 51 - 100 interval");
            return;
        }
         System.out.println("Your number is not of 0 - 100 interval");

    }
}
