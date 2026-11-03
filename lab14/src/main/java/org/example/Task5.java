package org.example;

import java.io.*;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String fileName = "f.txt";

        int[] numbers = {16, 24, 33, 40, 7, 64, 88, 15, 100, 9};
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (int n : numbers) pw.println(n);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.print("Числа в файле: ");
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                System.out.print(num + " ");
                if (num % 8 == 0) count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("\nКоличество чисел, кратных 8: " + count);
    }
}
