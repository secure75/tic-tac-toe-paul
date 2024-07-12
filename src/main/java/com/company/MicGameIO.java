package com.company;

import java.util.Scanner;

public class MicGameIO implements GameIO {

    public void printText(String text) {
        System.out.println(text);
    }

    public void printBoard(Board board) {
            System.out.println("Board:");
        //for (int i =0 ; i < 9; i++) {
            System.out.println("-------------");
            System.out.println("| " + board.getValueAt(1) + " | " + board.getValueAt(2) + " | " + board.getValueAt(3) + " |");
            System.out.println("-------------");
            System.out.println("| " + board.getValueAt(4) + " | " + board.getValueAt(5) + " | " + board.getValueAt(6) + " |");
            System.out.println("-------------");
            System.out.println("| " + board.getValueAt(7) + " | " + board.getValueAt(8) + " | " + board.getValueAt(9) + " |");
            System.out.println("-------------");
        //}
    }

    public int getInput() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        if (reader.hasNextInt()) {
                int number = reader.nextInt();
                //reader.close();
                if (number > 0 && number < 10) {
                    return number;
                } else {
                    return -1;
                }
        } else {
                //reader.close();
                return -1;
        }

    }

}
