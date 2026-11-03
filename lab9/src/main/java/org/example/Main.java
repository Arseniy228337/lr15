package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Furniture> list = new ArrayList<>();
        list.add(new Table("Стол 1", "Дуб", 25000, 4));
        list.add(new Table("Стол 2", "ЛДСП", 12000, 4));
        list.add(new Table("Стол 3", "Стекло", 8000, 1));
        list.add(new Chair("Стул 1", "Металл", 7000, true));
        list.add(new Chair("Стул 2", "Дерево", 4500, false));

        for (Furniture f : list) {
            f.displayInfo();
            System.out.println("Размеры: " + f.getDimensions());
            System.out.println();
        }
    }
}
