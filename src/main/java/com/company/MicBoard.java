package com.company;

public class MicBoard implements Board {

    private char[] field;
    private static int totalFieldNumber;

    public MicBoard() {
        totalFieldNumber = 9;
        field = new char[totalFieldNumber];
        for (int i = 0; i < totalFieldNumber; i++) {
            field[i] = '-';
        }
    }

    public char getValueAt(int index) {
        if (index <= totalFieldNumber && index > 0) {
            //System.out.println(field[index - 1] + " " + index);
            return field[index - 1];
        }
        return '-';
    }

    public void setValueAt(int index, char value) {
        if (index > 0 && index <= totalFieldNumber) {
            if(value == 'x' || value == 'o' || value == '-') {
                field[index - 1] = value;
                System.out.println(value + " " + field[index - 1]);
            } else {
                System.out.println("invalid value");
            }
        } else {
            System.out.println("invalid index");
        }
    }
    public void clear() {
        for (int i = 0; i < totalFieldNumber; i++) {
            field[i] = '-';
        }
    }

}