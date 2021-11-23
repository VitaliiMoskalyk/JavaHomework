package com.pb.moskalik.hw9;

import java.io.FileWriter;
import java.io.Writer;

public class FileNumbers {
    public void createNumbersFile(){
    try(Writer writer=new FileWriter("C:/Users/38050/Desktop/java")){
        int[][]array =new int[10][10];
    for(int i=0;i<array.length;i++, System.out.println()) {
        for (int j = 0; j < array.length; j++) {
            array[i][j] = ((int) (Math.random() * 99 + 1));
            System.out.println(array[i][j] + " ");
            writer.write(array[i][j] + " ");
        }
    }
    }catch(Exception e){
        System.out.println("Error"+e);
    }

    }

    public void createOddNumbersFile (){




    }

    public static void main(String[] args) {






    }
}
