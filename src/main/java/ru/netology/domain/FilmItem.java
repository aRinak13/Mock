package ru.netology.domain;

public class FilmItem {
    private int id;
    private String url;
    private String filmName;
    private String genre;

    public FilmItem(int id, String url, String filmName, String genre) {

    }

    public FilmItem() {
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
