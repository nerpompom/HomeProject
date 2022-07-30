package com.homeproject.lesson_1.lesson_6;

public class AnimalMainApp {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Kotik");
        Cat cat2 = new Cat("Barsik");
        Dog dog1 = new Dog("Sobachka");
        Dog dog2 = new Dog("Pif");


        cat1.run(167);
        cat2.run(210);
        dog1.run(356);
        dog2.run(568);
        cat1.swim(10);
        cat2.swim(0);
        dog1.swim(5);
        dog2.swim(13);

    }
}
