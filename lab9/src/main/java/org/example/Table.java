package org.example;
public class Table extends Furniture {
    private int legs;

    public Table(String name, String material, double price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }

    public int getLegs() { return legs; }
    public void setLegs(int legs) { this.legs = legs; }

    @Override
    public String getPurpose() { return "Поверхность для работы"; }

    @Override
    public String getDimensions() { return "120x80x75 см"; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("поле"+ super.name);
        System.out.println("Ножки: " + legs);
    }
}
