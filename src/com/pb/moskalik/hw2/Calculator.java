package com.pb.moskalik.hw2;

import jdk.nashorn.internal.ir.Symbol;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, write please your name");
        Scanner scan=new Scanner(System.in);
        String name =scan.next();

        System.out.println(name +", " + "this is the Calculator ! Let`s start !");
        System.out.println("now please write FIRST number");
        int operand1=scan.nextInt();

        System.out.println("OK, your number is "+operand1 + ". Write please a SYMBOL - what you want do with FIRST number?");
        String symbol;
        String sign=scan.next();


        System.out.println("now please write SECOND number");
        int operand2=scan.nextInt();

        int answer;

        switch (sign){
            case "+":
                answer=operand1+operand2;
                System.out.println("The answer of "+operand1 + sign + operand2 +" is " + answer);
            break;

            case "-":
                answer=operand1-operand2;
                System.out.println("The answer of "+operand1 + sign + operand2 +" is " + answer);
                break;

            case "*":
                answer=operand1*operand2;
                System.out.println("The answer of "+operand1 + sign + operand2 +" is " + answer);
                break;

            case "/":
                if (operand2!=0){
                answer=operand1/operand2;
                System.out.println("The answer of "+operand1 + sign + operand2 +" is " + answer);}
                System.out.println("OOOPS ! "+operand1+ "/"+ operand2+" is underfined !");
                break;
            default:
                System.out.println("You may write only +, -, *, / symbols");

        }


    }
}
