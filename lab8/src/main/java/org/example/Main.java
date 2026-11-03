package org.example;
public class Main {
    public static void main(String[] args) {

        Professional[] professionals = new Professional[5];

        professionals[0] = new Doctor("Иванов И.И.", 15, 4.8, "Кардиология", "Городская больница №1");
        professionals[1] = new Doctor("Сидорова А.В.", 10, 4.6, "Неврология", "Клиника Здоровье");
        professionals[2] = new Doctor("Кузнецов Д.С.", 7, 4.3, "Педиатрия", "Детская поликлиника");
        professionals[3] = new Engineer("Петров П.П.", 8, 4.5, "Автоматизация линий", "Java");
        professionals[4] = new Engineer("Смирнов К.А.", 12, 4.9, "Робототехника", "C++");

        for (Professional p : professionals) {
            if (p instanceof Doctor) {
                Doctor d = (Doctor) p;
                System.out.println(d.diagnose());
            } else if (p instanceof Engineer) {
                Engineer e = (Engineer) p;
                System.out.println(e.design());
            }
        }
    }
}