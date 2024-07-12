package com.company;

public class MicGame implements Game {

    private Board board;

    public MicGame(Board board) { //{
        this.board = board;
    }

    public void start() {
        System.out.println("asda");
    }

    public boolean hasWon(char player) {
        if ( micTestRow(1,2,3)) {
            //System.out.println( player + " has one");
            return true;
        } else {
            return false;
        }
    }

    public boolean micTestRow(int one, int two, int three) {
        //System.out.println("null" + this.board.getValueAt(1));
        //System.out.println( this.board.getValueAt(one) + "what" +  this.board.getValueAt(two));
        if ( this.board.getValueAt(one) != '-' && this.board.getValueAt(two) != '-' && this.board.getValueAt(three) != '-' && this.board.getValueAt(one) == this.board.getValueAt(two) && this.board.getValueAt(two) == this.board.getValueAt(three)) {
            //System.out.println("winner");

            return true;

        } else {
            return false;
        }
    }

        //while
        //anzahl fields wurzel ergibt 3
        //        for (int m=0; m<anzahl; m++)
        //i=1; j=i+1k=j+1;

        //if ( field[i] == player && field[j] == player && field[k] == player)


        public boolean isTie () {
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


