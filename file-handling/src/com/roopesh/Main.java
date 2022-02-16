package com.roopesh;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        appendFile("test.txt", "Not working");
    }

    public static void createFile(String fileName) {
        String path = "D:\\EData\\1-java\\file-handling\\src\\com\\roopesh\\";
        String pathToFile = path.concat(fileName);
        File file = new File(pathToFile);
        try {
            if(file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File exists");
            }
        } catch(Exception err) {
            System.out.println(err);
        }
    }

    public static void readFile(String fileName) {
        try{
            String path = "D:\\EData\\1-java\\file-handling\\src\\com\\roopesh\\";
            String pathToFile = path.concat(fileName);
            File file = new File(pathToFile);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch(Exception err) {
            System.out.println(err);
        }
    }

    public static void writeFile(String fileName, String str) {
        try{
            String path = "D:\\EData\\1-java\\file-handling\\src\\com\\roopesh\\";
            String pathToFile = path.concat(fileName);

            FileWriter fileWriter = new FileWriter(pathToFile);
            fileWriter.write(str);
            fileWriter.close();

            System.out.println("Successful!");
        } catch(Exception err) {
            System.out.println(err);
        }
    }

    public static void appendFile(String fileName, String str) {
        try{
            String path = "D:\\EData\\1-java\\file-handling\\src\\com\\roopesh\\";
            String pathToFile = path.concat(fileName);

            FileWriter fileWriter = new FileWriter(pathToFile);
            fileWriter.append(str);
            fileWriter.close();

            System.out.println("Successful!");
        } catch(Exception err) {
            System.out.println(err);
        }
    }
}
