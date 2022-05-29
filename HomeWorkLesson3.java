package com.homeproject.lesson_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        //Метод для задания №5
        initialValueArray();
        //Метод для задания №7
        System.out.println("Задание № 7. Наличие равенства между правой и левой частью массива: " + checkBalance());
        //Метод для задания №8
        moveNArray();

        //Задание №1
        Random random = new Random();
        int[] binaryArray = {1, 0, 1, 0, 1, 1, 0, 0, 1, 0};
        System.out.println("Задание № 1. Начальный массив " + Arrays.toString(binaryArray));
        for (int i = 0; i < 10; i++) {
            if (binaryArray[i] == 1) {
                binaryArray[i] = 0;
            }
            else {
                binaryArray[i] = 1;
            }
        }
        System.out.println("Задание № 1. Массив, где 1 заменено на 0, а 0 на 1 " + Arrays.toString(binaryArray));

        //Задание №2
        int[] oneHundredArray = new int[100];
        for (int i = 0; i < 100; i++) {
            oneHundredArray[i] = i + 1;
        }
        System.out.println("Задание № 2 " + Arrays.toString(oneHundredArray));

        //Задание №3
        int[] sixDivisionArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание № 3. Начальный массив " + Arrays.toString(sixDivisionArray));
        for (int i = 0; i < 12; i++) {
            if (sixDivisionArray[i] < 6) {
                sixDivisionArray[i] = sixDivisionArray[i] * 6;
            }
        }
        System.out.println("Задание № 3. Массив, где числа меньше 6 умножены на 6 " + Arrays.toString(sixDivisionArray));

        //Задание №4
        int [] [] diagonalArray = new int [7] [7];
        System.out.println("Задание № 4. Массив, диагонали, которого заполнены единицами");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    diagonalArray [i] [j] = 1;
                }
                else if (i + j == diagonalArray.length - 1) {
                    diagonalArray [i] [j] = 1;
                }

                System.out.print(diagonalArray[i] [j] + " ");
            }
            System.out.println();
        }
        //Задание №6
        int[] minMaxArray = {5, 1, 3, 17, 5, 8, 20};
        int min = minMaxArray[0];
        int max = minMaxArray[0];
        for (int i = 0; i < minMaxArray.length; i++) {
            if (min > minMaxArray[i]) {
                min = minMaxArray[i];
            }
            if (max < minMaxArray[i]) {
                max = minMaxArray[i];
            }
        }
        System.out.println("Задание № 6. " + Arrays.toString(minMaxArray));
        System.out.println("Задание № 6. Минимальное значение в массиве равно " + min);
        System.out.println("Задание № 6. Максимальное значение в массиве равно " + max);
    }
    //Задание №5
    public static void initialValueArray () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание № 5. Ввведите длину массива (len) = ");
        int len = scanner.nextInt();
        int[] ValueArray = new int[len];
        System.out.println("Задание № 5. Введите содержимое массива (initialValue) = ");
        int initialValue = scanner.nextInt();
        for (int i = 0; i < ValueArray.length; i++) {
            ValueArray[i] = initialValue;
        }
        System.out.println("Задание № 5. " + Arrays.toString(ValueArray));
    }
    //Задание №7
    public static boolean checkBalance() {
        int[] checkBalanceArray = {1, 0, 2, 0};
        System.out.println("Задание № 7. " + Arrays.toString(checkBalanceArray));
        int sum = 0;
        int check = 0;
        for (int i = 0; i < checkBalanceArray.length; i++) {
            sum += checkBalanceArray[i];
        }
        for (int i = 0; i < checkBalanceArray.length; i++) {
            sum -= checkBalanceArray[i];
            check += checkBalanceArray[i];
            if (check == sum) {
                return true;
            }
            else if (checkBalanceArray.length -  i == 2) {
                return false;
            }
        }
        return false;
    }
    //Задание №8
    public static void moveNArray() {
        int n = -1;
        int[] moveArray = {0, 1, 2, 3};

        System.out.println("Задание № 8. Начальный массив " + Arrays.toString(moveArray));
        for (int i = 0; i < moveArray.length; i++) {
            if (i + n < moveArray.length && n >= 0) {
                moveArray[i] = moveArray[i + n];
            } else if (i + n >= moveArray.length && n >= 0) {
                moveArray[i] = Math.abs(moveArray.length - i - n);
            }
        }
        for (int i = 3; i >= 0; i--) {
            if ( i+n >= 0 && n < 0) {
                moveArray[i] = moveArray[i+n];
            }
            else if (i+n < 0 && n < 0) {
                moveArray[i] = Math.abs(moveArray.length + i + n);
            }
        }
        if ( n >= 0){
            System.out.println("Задание № 8. n равно: " + n);
            System.out.println("Задание № 8. n >= 0. Каждый элемент массива сдвинулся влево на n " + Arrays.toString(moveArray));
        }
        else {
            System.out.println("Задание № 8. n равно: " + n);
            System.out.println("Задание № 8. n < 0. Каждый элемент массива сдвинулся вправо на n " + Arrays.toString(moveArray));
        }
    }
}

