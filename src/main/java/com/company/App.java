package com.company;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        GameIO gameio = new MicGameIO();

        MicGameIO {
            baord =
        }

        Board board = new MicBoard();
        Game game = new MicGame();

        boolean player = false; // false = o, true = x
        boolean gameover = false;
        char xo;
        gameio.printText("Player 1 starts, Please enter 1-9");

        //System.out.println(gameio.getInput());
        //int input = gameio.getInput();

        while (!gameover) {
            int input = gameio.getInput();
            int turn = 0;

            System.out.println(input);
            if (input == -1 || board.getValueAt(input) != '-' ) {
                gameio.printBoard(board);
                gameio.printText("Input not valid or field is in use, Please enter 1-9");
            } else {
                gameio.printText("you entered " + input);
                if (player) {
                    xo = 'o';
                } else {
                    xo = 'x';
                }
                turn++;
                board.setValueAt(input, xo);
                player = !player;
                if ( game.isTie(turn) ) {
                    gameio.printText("Unentschieden");
                    gameover = true;
                }
                gameio.printBoard(board);
            }
        }


        //System.out.println(input);


    }
}