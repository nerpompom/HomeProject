package com.homeproject.lesson_1.lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat (String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public String getName() {return name;}
    public boolean getSatiety() {return satiety;}

    public void eat(Plate plate) {
        if (appetite <= plate.getFoodCount()) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(getName() + " поел(а) из тарелки");
        }
        else {
            System.out.println("В тарелке слишком мало еды для " + getName());
        }
    }

}
