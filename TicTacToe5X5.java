package com.homeproject.lesson_1;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe5X5 {
    Random random;
    Scanner scanner;
    char [] [] table;

    TicTacToe5X5() {
        table = new char [5] [5];
        random = new Random();
        scanner = new Scanner(System.in);
    }
    public static final int DOTS_TO_WIN = 4;

    public static void main(String[] args) {
        new TicTacToe5X5().game();
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
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (table [x] [y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
    boolean checkWin(char symbol) {
        //проверка победы для строк
        for (int x = 0; x < 5; x++) {
            int sumToWin = 0;
            for (int y = 0; y < 5; y++) {
                if (table [x] [y] == symbol) {
                    sumToWin += 1;
                }
                else if (table [x] [y] != symbol) {
                    sumToWin = 0;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для столбцов
        for (int y = 0; y < 5; y++) {
            int sumToWin = 0;
            for (int x = 0; x < 5; x++) {
                if (table [x] [y] == symbol) {
                    sumToWin += 1;
                }
                else if (table [x] [y] != symbol) {
                    sumToWin = 0;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для центральной диагонали "\"
        int sumToWin = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (table [x] [y] == symbol && x == y) {
                    sumToWin += 1;
                }
                else if (table [x] [y] != symbol && x == y) {
                    sumToWin = 0;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для центральной диагонали "/"
        sumToWin = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (table [x] [y] == symbol && x + y == 4) {
                    sumToWin += 1;
                }
                else if (table [x] [y] != symbol && x + y == 4) {
                    sumToWin = 0;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для побочной диагонали "/" (сумма х + у == 3)
        sumToWin = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (table [x] [y] == symbol && x + y == 3) {
                    sumToWin += 1;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для побочной диагонали "/" (сумма х + у == 5)
        sumToWin = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (table [x] [y] == symbol && x + y == 5) {
                    sumToWin += 1;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для побочной диагонали "\" (х > у на 1)
        sumToWin = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (table [x] [y] == symbol && x - y == 1) {
                    sumToWin += 1;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        //проверка победы для побочной диагонали "\" (у > х на 1)
        sumToWin = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (table [x] [y] == symbol && y - x == 1) {
                    sumToWin += 1;
                }
                if (sumToWin == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }
    void turnHuman() {
        int x, y;
        System.out.println("Enter x y from [0...4]");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (isCellValid(x, y)) table [x] [y] = 'x';
        else turnHuman();
    }

    boolean isCellValid(int x, int y) {
        if( x < 0 || y < 0 || x > 4 || y > 4) {
            return false;
        }
        return table [x] [y] == '.';
    }
    void turnAI() {
        int x, y;
        int runAI = 0;
        for (x = 0; x < 5; x++) {
            if (runAI == 1) break;
            for (y = 0; y < 5; y++) {
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
            x = random.nextInt(5);
            y = random.nextInt(5);
            if (isCellValid(x, y)) table [x] [y] = 'o';
            else turnAI();
        }
    }
    void initTable () {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                table [x] [y] = '.';
            }
        }
    }
    void printTable () {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(table [x] [y] + " ");
            }
            System.out.println();
        }
    }
}
