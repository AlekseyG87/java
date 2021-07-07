package krest_nol;

import java.util.Random;
import java.util.Scanner;


public class Main {
    private static final int SIZE = 3; //
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static final int DOT_WIN = 3; //игры на поле другого размера можно менять
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char[][] field;

    private static void initField() {
        fieldSizeX = SIZE;
        fieldSizeY = SIZE;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");
        for (int x = 0; x < fieldSizeX * 2 + 1; x++)
            System.out.print((x % 2 == 0) ? "-" : x / 2 + 1);
        System.out.println();

        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < fieldSizeX; x++)
                System.out.print(field[y][x] + "|");
            System.out.println();
        }

        for (int x = 0; x <= fieldSizeX * 2 + 1; x++)
            System.out.print("-");
        System.out.println();
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода по Х и У (от 1 до 3) через пробел >>>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static void aiTurn() {
        int x;
        int y;

        if (field[1][1] == DOT_HUMAN) {
            field[0][0] = DOT_AI;
            if (field[2][2] == DOT_HUMAN) {
                field[2][0] = DOT_AI;
                if (field[1][0] == DOT_HUMAN) field[1][2] = DOT_AI;
                if (field[0][1] == DOT_HUMAN) field[2][1] = DOT_AI;
                if (field[0][1] == DOT_HUMAN || field[0][2] == DOT_HUMAN || field[1][2] == DOT_HUMAN || field[2][1] == DOT_HUMAN)
                    field[1][0] = DOT_AI;
            }
        }
        if (field[0][0] == DOT_HUMAN) field[1][1] = DOT_AI;
            if (field[0][2] == DOT_HUMAN) field[0][1] = DOT_AI;
                if (field[1][2] == DOT_HUMAN) field[0][1] = DOT_AI;
                    if (field[2][1] == DOT_HUMAN) field[2][2] = DOT_AI;
                    if (field[2][1] != DOT_HUMAN) field[2][1] = DOT_AI;
                if (field[1][2] != DOT_HUMAN) field[1][2] = DOT_AI;

        //do {
        //    x = RANDOM.nextInt(fieldSizeX);
        //    y = RANDOM.nextInt(fieldSizeY);
        //    } while (!isEmptyCell(x, y));
        //    field[y][x] = DOT_AI;

    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(x, y)) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char c) {
        int countHor = 0;
        int countVer = 0;
        int countDia1 = 0;
        int countDia2 = 0;
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == c) countVer++;
                if (field[x][y] == c) countHor++;
            }
            if (countVer == DOT_WIN || countHor == DOT_WIN) return true;
            if (field[y][y] == c) countDia1++;
            if (field[y][field[y].length - y - 1] == c) countDia2++;
            if (countDia1 == DOT_WIN || countDia2 == DOT_WIN) return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String answer;
        do {
            initField();
            printField();
            while (true) {
                humanTurn();
                if (checkEndGame(DOT_HUMAN, "Human win!")) break;
                aiTurn();
                if (checkEndGame(DOT_AI, "Computer win!")) break;
            }
            System.out.println("Wanna play again? (y/n) >>> ");
            answer = SCANNER.next();
        } while (answer.equals("y"));
        SCANNER.close();
    }

    private static boolean checkEndGame(char dot, String winMessage) {
        printField();
        if (checkWin(dot)) {
            System.out.println(winMessage);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }
}
