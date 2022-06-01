package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        try (FileWriter fileWriter = new FileWriter("myHomeWork.txt")){
            for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
                String letter = Character.toString(ch1);
                fileWriter.write(ch1 + " " + letter.toLowerCase() + "\n");
            }

            for (char i = '0'; i <= '9'; i++) {
                fileWriter.write(i+"\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }


        try (FileReader fileReader = new FileReader("myHomeWork.txt")){
            Scanner scanner = new Scanner(fileReader);
            int counter = 1;
            while(scanner.hasNextLine()){
                System.out.println(counter +" ) "+scanner.nextLine());
                counter++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        }
    }

