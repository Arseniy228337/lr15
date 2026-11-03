package org.example;

import java.util.ArrayList;
import java.util.List;

public class Singer {
    private int id;
    private String name;
    private String genre;
    private int popularity;
    private List<Integer> albumRatings;

    public Singer(int id, String name, String genre, int popularity) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.popularity = popularity;
        this.albumRatings = new ArrayList<>();
    }

    public double getAverageAlbumRating() {
        if (albumRatings.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int r : albumRatings) {
            sum += r;
        }
        return (double) sum / albumRatings.size();
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public List<Integer> getAlbumRatings() {
        return albumRatings;
    }

    public void addAlbumRating(int rating) {
        albumRatings.add(rating);
    }

    @Override
    public String toString() {
        return String.format("Singer{id=%d, name='%s', genre='%s', popularity=%d, avgRating=%.2f}",
                id, name, genre, popularity, getAverageAlbumRating());
    }
}
