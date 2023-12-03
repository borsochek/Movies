package ru.netology.domain;

public class Movies {
    private Movies[] movies;
    private final int limit;

    public Movies() {
        this.limit = 5;
        this.movies = new Movies[0];
    }

    public Movies(int limit) {
        this.limit = limit;
        this.movies = new Movies[0];
    }

    public void add(Movies point) {
        Movies[] tmp = new Movies[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = point;
        movies = tmp;
    }

    public Movies[] findAll() {
        return movies;
    }

    public Movies[] findLast() {
        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        Movies[] result = new Movies[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}