package com.epam.OOP;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur = " a fur.";
        String paws = " paws and";
        if (!hasFur) fur = " no fur.";
        if (numberOfPaws == 1) paws = " paw and";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + paws + fur;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getDescription());
        Bird bird = new Bird();
        System.out.println(bird.getDescription());
    }

}
