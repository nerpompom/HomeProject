package com.homeproject.lesson_1.lesson_7;

public class MainApp {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[4];
        catArray[0] = new Cat("Boris", 10, false);
        catArray[1] = new Cat("Murka", 15, false);
        catArray[2] = new Cat("Simba", 27, false);
        catArray[3] = new Cat("Koshka", 10, false);

        Plate plate = new Plate(60);

        plate.info();
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
        }
        plate.info();
        for (int i = 0; i < catArray.length; i++) {
            System.out.println("Сытость " + catArray[i].getName() + ":" + catArray[i].getSatiety());
        }
        for (int i = 0; i < catArray.length; i++) {
            if (catArray[i].getSatiety() == false) {
                plate.addFood(catArray[i].getAppetite());
                System.out.println("В тарелку добавили " + catArray[i].getAppetite() + " еды, теперь в тарелке " + plate.getFoodCount() + " еды");
            }
        }


    }
}
