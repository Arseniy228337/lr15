package org.example;
public class Doctor extends Professional {
    private String specialization;
    private String hospital;

    public Doctor(String name, int experience, double rating, String specialization, String hospital) {
        super(name, experience, rating);
        this.specialization = specialization;
        this.hospital = hospital;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getHospital() { return hospital; }
    public void setHospital(String hospital) { this.hospital = hospital; }

    @Override
    public String work() {
        return "Лечит пациентов";
    }

    public String diagnose() {
        return "Доктор " + getName() + " (" + specialization + ") ставит диагноз в " + hospital;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("поле"+ super.name);
        System.out.println("Специализация: " + specialization);
        System.out.println("Больница: " + hospital);
    }
}