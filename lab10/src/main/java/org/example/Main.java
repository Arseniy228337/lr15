package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Workable.info();

        List<Workable> workers = new ArrayList<>();
        workers.add(new Doctor("Иванов", 10, "Хирург", 5));
        workers.add(new Doctor("Петров", 7, "Терапевт", 3));
        workers.add(new Doctor("Сидоров", 15, "Кардиолог", 8));
        workers.add(new Teacher("Смирнова", 12, "Математика", 25));
        workers.add(new Teacher("Кузнецов", 5, "Физика", 18));

        for (Workable w : workers) {
            w.work();
            System.out.println("Опыт: " + w.getExperience() + " лет");

            if (w instanceof Teachable) {
                Teachable t = (Teachable) w;
                t.teach();
                System.out.println("Учеников: " + t.getStudents());
            }
            System.out.println();
        }
    }
}
