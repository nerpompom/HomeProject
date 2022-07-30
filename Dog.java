package com.homeproject.lesson_1.lesson_6;

public class Dog extends Animal {
    private static int countDog;
    public Dog(String name) {
        super(name);
        countDog++;
        System.out.println("Пёс номер: " + countDog);
    }
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " пробежал(а) " + distance + " м ");
        }
        else {
            System.out.println(getName() + " не может пробежать больше 500 метров ");
        }
    }
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " проплыл(а) " + distance + " м ");
        }
        else {
            System.out.println(getName() + " не может проплыть больше 10 метров ");
        }
    }
}
