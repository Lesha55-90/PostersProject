package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PosterManagerTest {

    @Test
    public void test() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test1() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");
        manager.addPoster("Film II");
        manager.addPoster("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");
        manager.addPoster("Film II");
        manager.addPoster("Film III");
        manager.addPoster("Film IV");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");
        manager.addPoster("Film II");
        manager.addPoster("Film III");
        manager.addPoster("Film IV");
        manager.addPoster("Film V");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test5() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");
        manager.addPoster("Film II");
        manager.addPoster("Film III");
        manager.addPoster("Film IV");
        manager.addPoster("Film V");
        manager.addPoster("Film VI");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test6() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");


        String[] expected = {"Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test7() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");
        manager.addPoster("Film II");


        String[] expected = {"Film II", "Film I",};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test8() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");
        manager.addPoster("Film II");
        manager.addPoster("Film III");
        manager.addPoster("Film IV");


        String[] expected = {"Film IV", "Film III", "Film II", "Film I",};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test9() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");
        manager.addPoster("Film II");
        manager.addPoster("Film III");
        manager.addPoster("Films IV");
        manager.addPoster("Films V");


        String[] expected = {"Films V", "Films IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test10() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Film I");
        manager.addPoster("Film II");
        manager.addPoster("Film III");
        manager.addPoster("Films IV");
        manager.addPoster("Films V");
        manager.addPoster("Films VI");


        String[] expected = {"Films VI", "Films V", "Films IV", "Film III", "Film II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test11() {
        PosterManager manager = new PosterManager(6);


        manager.addPoster("Film I");
        manager.addPoster("Film II");
        manager.addPoster("Film III");
        manager.addPoster("Films IV");
        manager.addPoster("Films V");
        manager.addPoster("Films VI");

        String[] expected = {"Films VI", "Films V", "Films IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
