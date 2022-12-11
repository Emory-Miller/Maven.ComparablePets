package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BirdTest {

    @Test
    public void constructorTest() {

        Bird bird = new Bird("Emro");

        String expected = "Emro";
        String actual = bird.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {

        Bird bird = new Bird("Emro");

        String expected = "SQUAWK";
        String actual = bird.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest() {
        List<Pet> pets = new ArrayList<>();
        Bird bird1 = new Bird("Rudy");
        Bird bird2 = new Bird("Claire");
        Bird bird3 = new Bird("Layla");
        Bird bird4 = new Bird("Jax");
        Bird bird5 = new Bird("Hazel");

        pets.add(bird1);
        pets.add(bird2);
        pets.add(bird3);
        pets.add(bird4);
        pets.add(bird5);

        Collections.sort(pets);

        String expected = "Claire Hazel Jax Layla Rudy";
        String actual = pets.stream().map(Pet::getName).collect(Collectors.joining(" "));

        Assert.assertEquals(expected, actual);
    }
}