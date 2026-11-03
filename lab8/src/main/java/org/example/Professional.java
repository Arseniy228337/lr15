package org.example;
public class Professional {
     String name;
    private int experience;
    private double rating;

    public Professional(String name, int experience, double rating) {
        this.name = name;
        this.experience = experience;
        this.rating = rating;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public String work() {
        return "Работает";
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Опыт: " + experience + " лет");
        System.out.println("Рейтинг: " + rating);
    }
}