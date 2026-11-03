package org.example;
public class BoardGame extends Game {
    private int playersCount;

    public BoardGame(String name, String genre, double rating, int playersCount) {
        super(name, genre, rating);
        this.playersCount = playersCount;
    }

    @Override
    public String getDifficulty() {
        return "Легкая";
    }

    public void play(int level) {
        System.out.println("Настольная игра " + name +
                " на уровне " + level + " (игроков: " + playersCount + ")");
    }

    public void play(int level, int players) {
        System.out.println("Настольная игра " + name +
                " — уровень " + level + ", игроков за столом: " + players);
    }

    public int getPlayersCount() {
        return playersCount;
    }
}