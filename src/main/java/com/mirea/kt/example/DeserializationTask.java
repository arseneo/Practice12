package com.mirea.kt.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTask implements Runnable {
        private final String filePath;

        public DeserializationTask(String filePath) {
            this.filePath = filePath;
        }

        @Override
        public void run() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
                Message message = (Message) ois.readObject();
                System.out.println(message);                
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
