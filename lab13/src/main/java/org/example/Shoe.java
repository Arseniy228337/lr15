package org.example;

public class Shoe {
    private String brand;
    private int size;
    private String color;
    private double price;
    private int stock;

    public Shoe(String brand, int size, String color, double price, int stock)
            throws InvalidShoeDataException {
        setBrand(brand);
        setSize(size);
        setColor(color);
        setPrice(price);
        setStock(stock);
    }

    public void setBrand(String brand) throws InvalidShoeDataException {
        if (brand == null || brand.trim().isEmpty()) {
            throw new InvalidShoeDataException("Бренд не может быть пустым");
        }
        this.brand = brand;
    }

    public void setSize(int size) throws InvalidShoeDataException {
        if (size < 20 || size > 50) {
            throw new InvalidShoeDataException("Размер должен быть от 20 до 50, получено: " + size);
        }
        this.size = size;
    }

    public void setColor(String color) throws InvalidShoeDataException {
        if (color == null || color.trim().isEmpty()) {
            throw new InvalidShoeDataException("Цвет не может быть пустым");
        }
        this.color = color;
    }

    public void setPrice(double price) throws InvalidShoeDataException {
        if (price <= 0) {
            throw new InvalidShoeDataException("Цена должна быть > 0, получено: " + price);
        }
        this.price = price;
    }

    public void setStock(int stock) throws InvalidShoeDataException {
        if (stock < 0) {
            throw new InvalidShoeDataException("Склад не может быть отрицательным, получено: " + stock);
        }
        this.stock = stock;
    }

    public void sell(int quantity) throws StockException {
        if (quantity <= 0) {
            throw new StockException("Количество продажи должно быть > 0, получено: " + quantity);
        }
        if (quantity > stock) {
            throw new StockException("Недостаточно товара: на складе " + stock + ", запрошено " + quantity);
        }
        stock -= quantity;
        System.out.println("Продано " + quantity + " шт. " + brand + " (остаток: " + stock + ")");
    }

    public void restock(int quantity) throws StockException {
        if (quantity <= 0) {
            throw new StockException("Количество пополнения должно быть > 0, получено: " + quantity);
        }
        stock += quantity;
        System.out.println("Пополнено " + quantity + " шт. " + brand + " (остаток: " + stock + ")");
    }

    public String getBrand() { return brand; }
    public int getSize()     { return size; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
    public int getStock()    { return stock; }

    @Override
    public String toString() {
        return String.format("Shoe{brand='%s', size=%d, color='%s', price=%.2f, stock=%d}",
                brand, size, color, price, stock);
    }
}