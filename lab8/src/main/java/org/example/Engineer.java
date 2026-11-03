package org.example;
public class Engineer extends Professional {
    private String project;
    private String technology;

    public Engineer(String name, int experience, double rating, String project, String technology) {
        super(name, experience, rating);
        this.project = project;
        this.technology = technology;
    }

    public String getProject() { return project; }
    public void setProject(String project) { this.project = project; }

    public String getTechnology() { return technology; }
    public void setTechnology(String technology) { this.technology = technology; }

    @Override
    public String work() {
        return "Проектирует системы";
    }

    public String design() {
        return "Инженер " + getName() + " разрабатывает проект: " + project + " на технологии " + technology;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Проект: " + project);
        System.out.println("Технология: " + technology);
    }
}