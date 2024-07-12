package com.company;

public class MicGame implements Game {

    private Board board;

    public MicGame(Board board) { //{
    this.board = board;
    }

    public void start(){
        System.out.println("asda");
    }

    public boolean hasWon(char player) {
        System.out.println("asdas");
        return true;
    }


    //while
    //anzahl fields wurzel ergibt 3
    //        for (int m=0; m<anzahl; m++)
    //i=1; j=i+1k=j+1;

    //if ( field[i] == player && field[j] == player && field[k] == player)


   public boolean isTie() {
        boolean onefieldfree = false;
       for (int i = 0; i < 9; i++) {

           if (this.board.getValueAt(i) == '-') {
               onefieldfree = false;
           }
       }

       if (onefieldfree) {
           return true;
       } else {
           return false;
       }
    }

}

