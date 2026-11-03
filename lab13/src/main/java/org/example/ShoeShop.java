package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoeShop {
    private List<Shoe> shoes = new ArrayList<>();

    public void addShoe(Shoe shoe) {
        shoes.add(shoe);
    }

    public Shoe findShoe(String brand, int size) throws ShoeNotFoundException {
        for (Shoe s : shoes) {
            if (s.getBrand().equalsIgnoreCase(brand) && s.getSize() == size) {
                return s;
            }
        }
        throw new ShoeNotFoundException(
                "Обувь не найдена: brand='" + brand + "', size=" + size);
    }

    public void sellShoe(String brand, int size, int quantity)
            throws ShoeNotFoundException, StockException {
        Shoe s = findShoe(brand, size);
        s.sell(quantity);
    }

    public void restockShoe(String brand, int size, int quantity)
            throws ShoeNotFoundException, StockException {
        Shoe s = findShoe(brand, size);
        s.restock(quantity);
    }

    public void printAll() {
        System.out.println("Ассортимент магазина:");
        for (Shoe s : shoes) {
            System.out.println("  " + s);
        }
    }
}