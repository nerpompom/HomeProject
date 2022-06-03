package com.homeproject.lesson_1.lesson_6;

public class Cat extends Animal {
    private static int countCat;
    public Cat (String name) {
        super(name);
        countCat++;
        System.out.println("Кот номер: " + countCat);
    }
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " пробежал(а) " + distance + " м ");
        }
        else {
            System.out.println(getName() + " не может пробежать больше 200 метров ");
        }
    }
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать и " + distance + " м он(а) не проплывёт ");
    }
}
