package com.homeproject.lesson_1;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    Random random;
    Scanner scanner;
    char [] [] table;

    TicTacToe() {
        table = new char [3] [3];
        random = new Random();
        scanner = new Scanner(System.in);
    }
    public static final int DOTS_TO_WIN = 3;

    public static void main(String[] args) {
        new TicTacToe().game();
    }
    void game () {
        System.out.println("Game is started!");
        initTable();
        printTable();
        while(true) {
            turnHuman();
            if(checkWin('x')) {
                printTable();
                System.out.println("YOU WON!");
                break;
            }
            if(isTableFull()) {
                System.out.println("DRAW!");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')) {
                System.out.println("AI WON!");
                break;
            }
            if(isTableFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
    boolean isTableFull() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (table [x] [y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
    boolean checkWin(char symbol) {
        //проверка победы для строк
        for (int x = 0; x < 3; x++) {
            int sumToWin = 0;
            for (int y = 0; y < 3; y++) {
                if (table [x] [y] == symbol) {
                    sumToWin += 1;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для столбцов
        for (int y = 0; y < 3; y++) {
            int sumToWin = 0;
            for (int x = 0; x < 3; x++) {
                if (table [x] [y] == symbol) {
                    sumToWin += 1;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для диагонали "\"
        int sumToWin = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (table [x] [y] == symbol && x == y) {
                    sumToWin += 1;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для диагонали "/"
        sumToWin = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (table [x] [y] == symbol && x + y == 2) {
                    sumToWin += 1;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }
    void turnHuman() {
        int x, y;
        System.out.println("Enter x y from [0...2]");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (isCellValid(x, y)) table [x] [y] = 'x';
        else turnHuman();
    }

    boolean isCellValid(int x, int y) {
        if( x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table [x] [y] == '.';
    }
    void turnAI() {
        int x, y;
        int runAI = 0;
        for (x = 0; x < 3; x++) {
            if (runAI == 1) break;
            for (y = 0; y < 3; y++) {
                if (table[x][y] == '.') {
                    table[x][y] = 'x';
                    if (checkWin('x') == true) {
                        table[x][y] = 'o';
                        runAI = 1;
                        break;
                    } else table[x][y] = '.';
                }
            }
        }
        if (runAI != 1) {
            x = random.nextInt(3);
            y = random.nextInt(3);
            if (isCellValid(x, y)) table [x] [y] = 'o';
            else turnAI();
        }
    }
    void initTable () {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                table [x] [y] = '.';
            }
        }
    }
    void printTable () {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(table [x] [y] + " ");
            }
            System.out.println();
        }
    }
}


