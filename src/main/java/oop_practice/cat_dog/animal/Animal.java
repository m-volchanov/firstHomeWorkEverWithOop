package oop_practice.cat_dog.animal;

public abstract class Animal {

    private String animal;
    private String name;
    private String sound;

    public Animal(String animal, String name, String sound) {
        this.animal = animal;
        this.name = name;
        this.sound = sound;
    }

    public void sound() {
        System.out.println("I'm a " + animal + ". My name is " + name + ". " + sound);
    }

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}
