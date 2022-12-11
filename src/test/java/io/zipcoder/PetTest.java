package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PetTest {

    @Test
    public void constructorTest() {

        Pet pet = new Pet("Kimba");

        String expected = "Kimba";
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {

        Pet pet = new Pet("Kimba");

        String expected = "";
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortByName() {
        List<Pet> pets = new ArrayList<>();
        Bird pet1 = new Bird("Rudy");
        Dog pet2 = new Dog("Claire");
        Cat pet3 = new Cat("Layla");
        Bird pet4 = new Bird("Jax");
        Dog pet5 = new Dog("Hazel");

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        pets.add(pet5);

        Collections.sort(pets);

        String expected = "Claire Hazel Jax Layla Rudy";
        String actual = pets.stream().map(Pet::getName).collect(Collectors.joining(" "));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortByType() {
        List<Pet> pets = new ArrayList<>();
        Bird pet1 = new Bird("Rudy");
        Dog pet2 = new Dog("Claire");
        Cat pet3 = new Cat("Layla");
        Bird pet4 = new Bird("Jax");
        Dog pet5 = new Dog("Hazel");

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        pets.add(pet5);

        Collections.sort(pets, Comparator.comparing(Pet::getSpecies));

        String expected = "Bird Bird Cat Dog Dog";
        String actual = pets.stream().map(Pet::getSpecies).collect(Collectors.joining(" "));

        Assert.assertEquals(expected, actual);
    }

}