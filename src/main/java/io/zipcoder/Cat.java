package io.zipcoder;

public class Cat extends Pet{

    private String speak = "MEEEAAAAAOOO";
    public Cat(String name) {
        super(name);
        this.speak = speak;
    }

    @Override
    public String speak(){
        return speak;
    }
}
