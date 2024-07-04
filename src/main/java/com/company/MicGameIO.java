package com.company;

import java.util.Scanner;

public class MicGameIO implements GameIO {

    void printText(String text) {
        private String text;
        System.out.printf(text);
    }

    void printBoard(Board board) {

    }

    int getInput(int number) {
        private int number = 0;
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int number = reader.nextInt();
        reader.close();
        return number;
    }

}
