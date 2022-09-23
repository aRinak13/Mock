package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class FilmManager {

    private int countFilm = 10;

    public int getCountFilm() {
        return countFilm;
    }

    private FilmItem[] items = new FilmItem[0];

    public FilmManager() {

    }

    public FilmManager(int countFilm) {

        this.countFilm = countFilm;
    }

    public void add(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] getAll() {
        FilmItem[] result = new FilmItem[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length + i - items.length;
            result[i] = items[index];
        }
        return result;
    }

    public FilmItem[] getLastAdded() {
        int resultLength;
        if (items.length < this.countFilm) {
            resultLength = items.length;
        } else {
            resultLength = this.countFilm;
        }
        FilmItem[] result = new FilmItem[resultLength];
        if (items.length > 0) {
            int index = 0;
            for (int i = items.length - 1; i > items.length - resultLength - 1; i--) {
                result[index] = items[i];
                index++;
            }
        }
        return result;
    }
}
