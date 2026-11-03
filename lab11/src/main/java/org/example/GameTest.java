package org.example;
import java.util.ArrayList;
import java.util.List;

public class GameTest {
    public static void main(String[] args) {

        System.out.println("Созданные игры:");
        Game chess     = new BoardGame("Шахматы", "Логика", 9.1, 2);
        Game monopoly  = new BoardGame("Монополия", "Экономика", 8.3, 6);
        Game witcher   = new VideoGame("Ведьмак 3", "RPG", 9.8, "PC");
        Game minecraft = new VideoGame("Minecraft", "Sandbox", 9.0, "PS5");

        System.out.println(chess);
        System.out.println(monopoly);
        System.out.println(witcher);
        System.out.println(minecraft);

        System.out.println("\nПерегрузка методов play():");
        chess.play();
        chess.play(5);
        chess.play("cooperative");

        BoardGame bg = (BoardGame) chess;
        bg.play(3);
        bg.play(3, 4);

        VideoGame vg = (VideoGame) witcher;
        vg.play("PvP");
        vg.play("PvP", 10);

        System.out.println("\nПереопределение getDifficulty():");
        List<Game> games = new ArrayList<>();
        games.add(chess);
        games.add(monopoly);
        games.add(witcher);
        games.add(minecraft);

        for (Game g : games) {
            System.out.println(g.getName() + " — сложность: " + g.getDifficulty());
        }

        System.out.println("\nВыбор метода при перегрузке зависит от типа ссылки:");
        Game asGame = bg;
        asGame.play(3);
        bg.play(3);
    }
}