package org.example;

public class VideoGame extends Game {
    private String platform;

    public VideoGame(String name, String genre, double rating, String platform) {
        super(name, genre, rating);
        this.platform = platform;
    }

    @Override
    public String getDifficulty() {
        return "Сложная";
    }

    public void play(String mode) {
        System.out.println("Видеоигра " + name + " (платформа: " +
                platform + ") в режиме " + mode);
    }

    public void play(String mode, int level) {
        System.out.println("Видеоигра " + name +
                " — режим: " + mode + ", уровень: " + level);
    }

    public String getPlatform() {
        return platform;
    }
}
