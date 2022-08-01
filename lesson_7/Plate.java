package com.homeproject.lesson_1.lesson_7;

public class Plate {
    private int foodCount;
    public  Plate (int foodCount) {
        this.foodCount = foodCount;
    }
    public int getFoodCount() {
        return foodCount;
    }
    //public void setFoodCount(int foodCount) {this.foodCount = foodCount;}
    public void info() {
        System.out.println("Количество еды в тарелке: " + foodCount);
    }
    public void decreaseFood(int amount) {
        foodCount -= amount;

    }
    public void addFood(int food) {
        foodCount += food;
    }
}
