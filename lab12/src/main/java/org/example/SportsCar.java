package org.example;

public class SportsCar extends Auto {
    private int topSpeed;

    public SportsCar(String brand, int id, int horsepower, int topSpeed) {
        super(brand, id, horsepower);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", topSpeed=" + topSpeed + "}");
    }
}
