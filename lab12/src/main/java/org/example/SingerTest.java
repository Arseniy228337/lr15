package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SingerTest {

    public static void printSingers(List<Singer> singers, int popularity) {
        System.out.println("Певцы с популярностью >= " + popularity + ":");
        boolean found = false;
        for (Singer s : singers) {
            if (s.getPopularity() >= popularity) {
                System.out.println("  " + s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("  (нет)");
        }
    }

    public static List<Singer> sortSingers(List<Singer> singers) {
        System.out.println("Сортировка");
        singers.sort((x, y) -> {
            int cmp = Double.compare(y.getAverageAlbumRating(), x.getAverageAlbumRating());
            if (cmp != 0) {
                return cmp;
            }
            return y.getName().compareToIgnoreCase(x.getName());
        });
        return singers;
    }

    public static void main(String[] args) {

        List<Singer> singers = new ArrayList<>();
        singers.add(createSinger(1, "Anna",    "Pop",    70, 5, 4, 3));
        singers.add(createSinger(2, "Boris",   "Rock",   50, 2, 2, 1));
        singers.add(createSinger(3, "Vera",    "Jazz",   80, 5, 5, 4));
        singers.add(createSinger(4, "Gleb",    "Pop",    40, 3, 3, 2));
        singers.add(createSinger(5, "Dina",    "Rock",   90, 4, 5, 4));
        singers.add(createSinger(6, "Egor",    "Jazz",   30, 1, 2, 2));
        singers.add(createSinger(7, "Zhanna",  "Pop",    60, 4, 4, 4));
        singers.add(createSinger(8, "Ivan",    "Rock",   75, 5, 3, 4));

        System.out.println("Исходный список:");
        for (Singer s : singers) {
            System.out.println("  " + s);
        }

        Iterator<Singer> it = singers.iterator();
        while (it.hasNext()) {
            Singer s = it.next();
            if (s.getAverageAlbumRating() < 3) {
                it.remove();
            }
        }
        System.out.println("\nПосле удаления певцов со средним рейтингом < 3:");
        for (Singer s : singers) {
            System.out.println("  " + s);
        }

        for (Singer s : singers) {
            if (s.getAverageAlbumRating() >= 4) {
                s.setPopularity(s.getPopularity() + 10);
            }
        }
        System.out.println("\nПосле повышения популярности (avg >= 4, +10):");
        for (Singer s : singers) {
            System.out.println("  " + s);
        }

        System.out.println();
        printSingers(singers, 70);

        sortSingers(singers);

        System.out.println("\nОтсортировано по убыванию среднего рейтинга (при равенстве — по имени):");
        for (Singer s : singers) {
            System.out.printf("  ID=%d, имя=%-8s, средний рейтинг=%.2f%n",
                    s.getId(), s.getName(), s.getAverageAlbumRating());
        }
    }

    private static Singer createSinger(int id, String name, String genre,
                                       int popularity, int... ratings) {
        Singer s = new Singer(id, name, genre, popularity);
        for (int r : ratings) {
            s.addAlbumRating(r);
        }
        return s;
    }
}