package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    @Test
    public void add3FilmsAndGetLastAdded() {
        FilmManager film = new FilmManager();

        FilmItem film1 = new FilmItem(1, "image1", "Отпуск по обмену", "Комедия");
        FilmItem film2 = new FilmItem(2, "image2", "Гарри Поттер и узник Азкабана", "Фантастика");
        FilmItem film3 = new FilmItem(3, "image3", "Глаз", "Ужасы");
        film.add(film1);
        film.add(film2);
        film.add(film3);
        film.getLastAdded();

        FilmItem[] actual = film.getLastAdded();
        FilmItem[] expected = new FilmItem[] {
                film3,
                film2,
                film1
        };

        assertArrayEquals(expected, actual);

    }

    @Test
    public void add10FilmsAndGetLastAdded() {
        FilmManager film = new FilmManager();

        FilmItem film1 = new FilmItem(1, "image1", "Отпуск по обмену", "Комедия");
        FilmItem film2 = new FilmItem(2, "image2", "Гарри Поттер и узник Азкабана", "Фантастика");
        FilmItem film3 = new FilmItem(3, "image3", "Глаз", "Ужасы");
        FilmItem film4 = new FilmItem(4, "image1", "Отпуск по обмену", "Комедия");
        FilmItem film5 = new FilmItem(5, "image2", "Гарри Поттер и узник Азкабана", "Фантастика");
        FilmItem film6 = new FilmItem(6, "image3", "Глаз", "Ужасы");
        FilmItem film7 = new FilmItem(7, "image1", "Отпуск по обмену", "Комедия");
        FilmItem film8 = new FilmItem(8, "image2", "Гарри Поттер и узник Азкабана", "Фантастика");
        FilmItem film9 = new FilmItem(9, "image3", "Глаз", "Ужасы");
        FilmItem film10 = new FilmItem(10, "image1", "Отпуск по обмену", "Комедия");
        film.add(film1);
        film.add(film2);
        film.add(film3);
        film.add(film4);
        film.add(film5);
        film.add(film6);
        film.add(film7);
        film.add(film8);
        film.add(film9);
        film.add(film10);
        film.getLastAdded();

        FilmItem[] actual = film.getLastAdded();
        FilmItem[] expected = new FilmItem[] {
                film10,
                film9,
                film8,
                film7,
                film6,
                film5,
                film4,
                film3,
                film2,
                film1
        };

        assertArrayEquals(expected, actual);


    }

    @Test
    public void add10FilmsAndGetLastAdded5() {
        FilmManager film = new FilmManager(5);

        FilmItem film1 = new FilmItem(1, "image1", "Отпуск по обмену", "Комедия");
        FilmItem film2 = new FilmItem(2, "image2", "Гарри Поттер и узник Азкабана", "Фантастика");
        FilmItem film3 = new FilmItem(3, "image3", "Глаз", "Ужасы");
        FilmItem film4 = new FilmItem(4, "image1", "Отпуск по обмену", "Комедия");
        FilmItem film5 = new FilmItem(5, "image2", "Гарри Поттер и узник Азкабана", "Фантастика");
        FilmItem film6 = new FilmItem(6, "image3", "Глаз", "Ужасы");
        FilmItem film7 = new FilmItem(7, "image1", "Отпуск по обмену", "Комедия");
        FilmItem film8 = new FilmItem(8, "image2", "Гарри Поттер и узник Азкабана", "Фантастика");
        FilmItem film9 = new FilmItem(9, "image3", "Глаз", "Ужасы");
        FilmItem film10 = new FilmItem(10, "image1", "Отпуск по обмену", "Комедия");
        film.add(film1);
        film.add(film2);
        film.add(film3);
        film.add(film4);
        film.add(film5);
        film.add(film6);
        film.add(film7);
        film.add(film8);
        film.add(film9);
        film.add(film10);
        film.getLastAdded();

        FilmItem[] actual = film.getLastAdded();
        FilmItem[] expected = new FilmItem[] {
                film10,
                film9,
                film8,
                film7,
                film6
        };

        assertArrayEquals(expected, actual);
}

    @Test
    public void add0Films() {
        FilmManager film = new FilmManager();
        film.getLastAdded();

        FilmItem[] actual = film.getLastAdded();
        FilmItem[] expected = new FilmItem[] {
        };

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getCountFilms() {
        FilmManager film = new FilmManager();
        film.getCountFilm();

        int actual = film.getCountFilm();
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    public void getCountFilms5() {
        FilmManager film = new FilmManager(5);
        film.getCountFilm();

        int actual = film.getCountFilm();
        int expected = 5;

        assertEquals(expected, actual);

    }

}