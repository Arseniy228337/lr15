package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class AutoTest {
    public static void main(String[] args) {

        Map<String, Auto> autos = new LinkedHashMap<>();

        autos.put("Toyota",   new Sedan("Toyota", 1, 150, 480.5));
        autos.put("Honda",    new Sedan("Honda", 2, 140, 450.0));
        autos.put("BMW",      new Sedan("BMW", 3, 200, 500.0));

        autos.put("Jeep",     new SUV("Jeep", 4, 280, 220));
        autos.put("LandRover",new SUV("LandRover", 5, 300, 250));
        autos.put("Nissan",   new SUV("Nissan", 6, 250, 210));

        autos.put("Ferrari",  new SportsCar("Ferrari", 7, 700, 340));
        autos.put("Porsche",  new SportsCar("Porsche", 8, 650, 320));

        System.out.println("Все автомобили в коллекции:");
        for (Map.Entry<String, Auto> entry : autos.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nВсего записей: " + autos.size());
    }
}
