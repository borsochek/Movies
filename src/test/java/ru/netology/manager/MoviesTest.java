package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movies;

public class MoviesTest {
    Movies manager = new Movies(3);
    Movies film1 = new Movies();
    Movies film2 = new Movies();
    Movies film3 = new Movies();
    Movies film4 = new Movies();
    Movies film5 = new Movies();
    Movies film6 = new Movies();
    Movies film7 = new Movies();
    Movies film8 = new Movies();


    @Test
    public void FindAllTest() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        Movies[] expected = {film1, film2, film3};
        Movies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastTest() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        Movies[] expected = {film3, film2, film1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastIfEightInList() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        Movies[] expected = {film8, film7, film6};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastIfMoreThanLimit() {
        Movies manager = new Movies();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);


        Movies[] expected = {film8, film7, film6, film5, film4};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void IfLimitLargerArray() {
        manager.add(film1);
        manager.add(film2);

        Movies[] expected = {film2, film1};
        Movies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}