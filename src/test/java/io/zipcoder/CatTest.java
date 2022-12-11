package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CatTest {

    @Test
    public void constructorTest() {

        Cat cat = new Cat("Kimba");

        String expected = "Kimba";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {

        Cat cat = new Cat("Kimba");

        String expected = "MEEEAAAAAOOO";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest() {
        List<Pet> pets = new ArrayList<>();
        Cat cat1 = new Cat("Rudy");
        Cat cat2 = new Cat("Claire");
        Cat cat3 = new Cat("Layla");
        Cat cat4 = new Cat("Jax");
        Cat cat5 = new Cat("Hazel");

        pets.add(cat1);
        pets.add(cat2);
        pets.add(cat3);
        pets.add(cat4);
        pets.add(cat5);

        Collections.sort(pets);

        String expected = "Claire Hazel Jax Layla Rudy";
        String actual = pets.stream().map(Pet::getName).collect(Collectors.joining(" "));

        Assert.assertEquals(expected, actual);
    }

}
