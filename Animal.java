package com.homeproject.lesson_1.lesson_6;

public class Animal {
    private String name;
    private static int countAnimal;
    public Animal(String name) {
        this.name = name;
        countAnimal++;
        System.out.println("Животное номер: " + countAnimal);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println("Животное бежит");
    }
    public void swim(int distance) {
        System.out.println("Животное плывёт");
    }


}


