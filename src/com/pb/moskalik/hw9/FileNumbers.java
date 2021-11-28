package com.pb.moskalik.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNumbers {

    public static Path path = Paths.get("NumbersFile.txt");

    public static void createNumbersFile() throws IOException {

        try (BufferedWriter writer = Files.newBufferedWriter(path)){
            int [][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println(), writer.newLine()){
                for (int j = 0; j< array.length; j++){
                    array [i][j]= ((int) (Math.random()*99+1));
                    System.out.print(array[i][j] + " ");

                    writer.write(array[i][j] + " ");
                }
            }
        }catch (IOException e){System.out.println("Error" + e);}
    }



    public static void createOddNumbersFile() throws IOException {
        try (Scanner reader = new Scanner(path)) {
            PrintWriter writer2 = new PrintWriter(new File("odd-numbers.txt"));
            System.out.println("*********************");
            System.out.println("Новый массив:");
            while (reader.hasNextLine()) {
                Scanner scanner = new Scanner(reader.nextLine());
                while (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    if (num % 2 == 0) {
                        System.out.print("0");
                        num = 0;
                    } else
                        System.out.println(num + " ");
                    writer2.write(num + " ");
                }
                scanner.close();
                writer2.println();
            }
            System.out.println();
            writer2.close();

        }catch (IOException e){
            System.out.println("Error" + e);}}

    public static void main (String [] args) throws IOException {
        createNumbersFile();
        createOddNumbersFile();

    }
}