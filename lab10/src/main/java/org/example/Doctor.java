package org.example;

public class Doctor implements Workable, Teachable {
    private String name;
    private int experience;
    private String specialization;
    private int students;

    public Doctor(String name, int experience, String specialization, int students) {
        this.name = name;
        this.experience = experience;
        this.specialization = specialization;
        this.students = students;
    }

    @Override
    public void work() {
        System.out.println(name + " лечит пациентов (" + specialization + ")");
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void teach() {
        System.out.println(name + " обучает " + students + " студентов-медиков");
    }

    @Override
    public int getStudents() {
        return students;
    }
}
