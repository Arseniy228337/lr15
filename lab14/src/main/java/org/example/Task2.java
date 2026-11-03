package org.example;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    static boolean isPalindrome(int n) {
        int original = Math.abs(n);
        int temp = original;
        int reversed = 0;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return reversed == original;
    }

    public static void main(String[] args) {
        String fileName = "f.txt";
        Scanner sc = new Scanner(System.in);

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + "-е число: ");
                int num = sc.nextInt();
                pw.println(num);
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        int count = 0;
        System.out.print("\nЧисла из файла: ");
        try (Scanner fileSc = new Scanner(new File(fileName))) {
            while (fileSc.hasNextInt()) {
                int num = fileSc.nextInt();
                System.out.print(num + " ");
                if (isPalindrome(num)) count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("\nКоличество палиндромов: " + count);
    }
}
