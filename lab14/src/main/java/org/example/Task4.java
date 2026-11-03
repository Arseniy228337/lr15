package org.example;

import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "speeds.txt";
        Scanner sc = new Scanner(System.in);

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("Введите 15 вещественных значений скорости:");
            for (int i = 0; i < 15; i++) {
                System.out.print((i + 1) + "-я скорость: ");
                double v = sc.nextDouble();
                pw.println(v);
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;
        try (Scanner fs = new Scanner(new File(fileName))) {
            while (fs.hasNextDouble()) {
                sum += fs.nextDouble();
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        if (count > 0)
            System.out.printf("Средняя скорость: %.2f%n", sum / count);
        else
            System.out.println("Файл пуст.");
    }
}
