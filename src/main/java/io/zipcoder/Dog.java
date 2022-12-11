package io.zipcoder;

public class Dog extends Pet{
    private String speak = "wuf";
    public Dog(String name) {
        super(name);
        this.speak = speak;
    }

    @Override
    public String speak(){
        return speak;
    }
}
