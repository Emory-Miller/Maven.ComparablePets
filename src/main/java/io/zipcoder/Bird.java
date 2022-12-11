package io.zipcoder;

public class Bird extends Pet{

    private String speak = "SQUAWK";
    public Bird(String name) {
        super(name);
        this.speak = speak;
    }

    @Override
    public String speak(){
        return speak;
    }
}
