package org.example;
public abstract class Furniture {
    public String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract String getPurpose();
    public abstract String getDimensions();

    public void displayInfo() {
        System.out.println(name + " | " + material + " | " + price + " руб. | "
                + getPurpose() + " | " + getDimensions());
    }
}
