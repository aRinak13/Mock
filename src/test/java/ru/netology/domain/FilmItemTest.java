package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmItemTest {

    @Test
    public void getItemId() {
        FilmItem item = new FilmItem();
        item.setId(1);
        item.getId();

        int actual = item.getId();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void getItemUrl() {
        FilmItem item = new FilmItem();
        item.setUrl("www");
        item.getUrl();

        String actual = item.getUrl();
        String expected = "www";

        assertEquals(expected, actual);
    }

    @Test
    public void getItemFilmName() {
        FilmItem item = new FilmItem();
        item.setFilmName("www");
        item.getFilmName();

        String actual = item.getFilmName();
        String expected = "www";

        assertEquals(expected, actual);
    }

    @Test
    public void getItemGenre() {
        FilmItem item = new FilmItem();
        item.setGenre("Комедия");
        item.getGenre();

        String actual = item.getGenre();
        String expected = "Комедия";

        assertEquals(expected, actual);
    }

}