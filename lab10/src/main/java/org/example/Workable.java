package org.example;

public interface Workable
{
    int name = 0;
    void work();
    int getExperience();

    static void info()
    {
        System.out.println("Интерфейс Workable — работа");
    }
}
