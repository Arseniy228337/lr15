package org.example;

public class ShoeShopDemo {
    public static void main(String[] args) {
        ShoeShop shop = new ShoeShop();

        try {
            shop.addShoe(new Shoe("Nike", 42, "black", 120.50, 10));
            shop.addShoe(new Shoe("Adidas", 41, "white", 99.99, 5));
            shop.addShoe(new Shoe("Puma", 43, "red", 85.00, 0));
        } catch (InvalidShoeDataException e) {
            System.out.println("Ошибка при создании обуви: " + e.getMessage());
        }

        shop.printAll();
        System.out.println();

        try {
            shop.sellShoe("Nike", 42, 3);
        } catch (ShoeNotFoundException | StockException e) {
            System.out.println("Ошибка продажи: " + e.getMessage());
        }

        try {
            shop.sellShoe("Puma", 43, 16);
        } catch (ShoeNotFoundException | StockException e) {
            System.err.println("Ошибка продажи: " + e.getMessage());
        }

        try {
            shop.restockShoe("Puma", 43, 7);
            shop.sellShoe("Puma", 43, 4);
        } catch (ShoeNotFoundException | StockException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            shop.sellShoe("Reebok", 45, 1);
        } catch (ShoeNotFoundException | StockException e) {
            System.out.println("Ошибка продажи: " + e.getMessage());
        }

        try {
            new Shoe("X", 60, "blue", 10, 1);
        } catch (InvalidShoeDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        try {
            new Shoe("Y", 40, "blue", -5, 1);
        } catch (InvalidShoeDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        System.out.println();
        shop.printAll();
    }
}