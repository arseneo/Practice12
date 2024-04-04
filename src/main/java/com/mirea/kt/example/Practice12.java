package com.mirea.kt.example;

import java.io.File;
import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath;
        System.out.println("Practical task 1.12, Student Korneev Arseniy, RIBO-04-22, Variant 2");

        while (true) {
            System.out.println("Enter path to file: ");
            filePath = scanner.nextLine();
            File file = new File(filePath);
            if (file.exists() && file.isFile()) {
                break;
            } else {
                System.out.println("File not found. Please enter correct file path.");
            }
        }
        Thread deserializationThread = new Thread(new DeserializationTask(filePath));
        deserializationThread.start();
    }
}