package com.homeproject.lesson_1;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        System.out.println(sumTwoInt(21, -1)); //Метод для задания №1
        isIntPosOrNeg(8); //Метод для задания №2
        System.out.println(isIntNeg(-4 )); //Метод для задания №3
        printString( "Текст строки",3 ); //Метод для задания №4
        System.out.println(isLeapYear(2024)); //Метод для задания №5
    }
    //Метод для задания №1
    public static boolean sumTwoInt(int a, int b) {
        if ( a + b >= 10 && a + b <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    //Метод для задания №2
    public static void isIntPosOrNeg(int a) {
        if ( a >= 0) {
            System.out.println("Число a положительное");
        }
        else {
            System.out.println("Число a отрицательное");
        }
    }
    //Метод для задания №3
    public static boolean isIntNeg(int a) {
        if ( a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    //Метод для задания №4
    public static void printString(String line, int a) {
        for (a = 0; a < 3; a++ ) {
            System.out.println(line);
        }
    }
    //Метод для задания №5
    public static boolean isLeapYear(int a) {
        if ( a % 400 == 0 ) {
            return true;
        }
        else if ( a % 100 == 0) {
            return false;
        }
        else if ( a % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
