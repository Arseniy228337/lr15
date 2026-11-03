package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();

        try (PrintWriter pw = new PrintWriter(new FileWriter("f.txt"))) {
            for (int i = 0; i < 20; i++) {
                pw.println(rnd.nextInt(200) - 100);
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи f: " + e.getMessage());
            return;
        }

        try (Scanner sc = new Scanner(new File("f.txt"));
             PrintWriter g = new PrintWriter(new FileWriter("g.txt"));
             PrintWriter h = new PrintWriter(new FileWriter("h.txt"))) {

            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 11 == 0) g.println(num);
                else h.println(num);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("f.txt:");
        printFile("f.txt");
        System.out.println("\ng.txt:");
        printFile("g.txt");
        System.out.println("\nh.txt:");
        printFile("h.txt");
    }

    static void printFile(String fileName) {
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) System.out.println(sc.nextLine());
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
