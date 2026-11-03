package org.example;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "dream.txt";
        String dream = "Моя мечта — мечта мечта мечта.";

        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(dream);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        File file = new File(fileName);
        System.out.println("Информация о файле:");
        System.out.println("Имя: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());

        System.out.println("\nСодержимое файла:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
