package io.zipcoder;

import java.util.ArrayList;

import static java.lang.System.in;
import static java.lang.System.out;

public class Application {
    static Console console = new Console(in, out);

    static ArrayList<Pet> petsOwnedList = new ArrayList<>();

    public static void main(String[] args) {

        int numPets = console.getIntInput("How many pets do you have?");

        addPetsToListFromInput(numPets);

        petSpeakFromList();

    }

    public static void addPetsToListFromInput(int numPets){
        for (int i = 0; i < numPets; i++) {
            String type = console.getStringInput("What kind of pet is it?");
            String name = console.getStringInput("Whats the name of your pet?");
            petsOwnedList.add(petFromInput(type, name));
        }
    }

    public static void petSpeakFromList(){
        for (Pet pets : petsOwnedList){
            console.println(pets.speak());
        }
    }

    public static Pet petFromInput(String type, String name) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog(name);
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat(name);
        } else if (type.equalsIgnoreCase("bird")) {
            return new Bird(name);
        } return null;
    }

}

