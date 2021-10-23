package com.pb.moskalik.hw3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Hello,this is BINGO game");
        System.out.println("Guess number from 0 to 100");
        System.out.println("Set number or 101 for exit game");

        Scanner scan=new Scanner(System.in);

        int counter=0;
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff) + min;

        do{ counter++;

            int symbol = scan.nextInt();

            if (symbol==101) break;
            if(symbol>i) {
                System.out.println("Not correct, the number is less");
            }
            if(symbol<i) {
                System.out.println("Not correct, the number is more");
            }
            if(symbol==i){
                System.out.println("YOU WIN from "+counter+" attempt");
                break;
            }

        }while(true);

        System.out.println("Game over");

    }
}
