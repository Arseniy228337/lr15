package org.example;

public class Auto {
    protected String brand;
    protected int id;
    protected int horsepower;

    public Auto(String brand, int id, int horsepower) {
        this.brand = brand;
        this.id = id;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {brand='" + brand + "', id=" + id + ", horsepower=" + horsepower + "}";
    }
}