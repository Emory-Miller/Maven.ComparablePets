package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DogTest {

    @Test
    public void constructorTest() {

        Dog dog = new Dog("Rudy");

        String expected = "Rudy";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {

        Dog dog = new Dog("Rudy");

        String expected = "wuf";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest() {
        List<Pet> pets = new ArrayList<>();
        Dog dag1 = new Dog("Rudy");
        Dog dag2 = new Dog("Claire");
        Dog dag3 = new Dog("Layla");
        Dog dag4 = new Dog("Jax");
        Dog dag5 = new Dog("Hazel");

        pets.add(dag1);
        pets.add(dag2);
        pets.add(dag3);
        pets.add(dag4);
        pets.add(dag5);

        Collections.sort(pets);

        String expected = "Claire Hazel Jax Layla Rudy";
        String actual = pets.stream().map(Pet::getName).collect(Collectors.joining(" "));

        Assert.assertEquals(expected, actual);
    }

}
