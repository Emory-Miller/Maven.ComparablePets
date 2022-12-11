package io.zipcoder;

import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet> {

    private String name;
    private String species = getClass().getSimpleName();
    private String speak = "";

    public Pet(String name) {
        this.name = name;
        this.species = species;
        this.speak = speak;
    }

    public String speak(){
        return speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public int compareTo(Pet o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.getSpecies().compareTo(o2.getSpecies());
    }
}