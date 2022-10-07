import java.util.*;
import java.util.Scanner;

public class Board {
    static ArrayList<Character> playerPos = new ArrayList<>();

    // Print out the board and loop through so it is formed as a square
    char[][] layer = {{' ', '║', ' ', '║', ' '},
                      {'═', '╬', '═', '╬', '═',},
                      {' ', '║', ' ', '║', ' '},
                      {'═', '╬', '═', '╬', '═'},
                      {' ', '║', ' ', '║', ' '}};

    public void printBoard() {

        for (char[] eachRow : layer) {
            for (char c : eachRow) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //This method catches exceptions if players enter a string

    public int testInput() {

        Scanner input = new Scanner(System.in);

        int playerChoose = 0;

        try {
            playerChoose = input.nextInt();

        } catch (Exception e) {

            System.out.println("Please type only numbers between 1-9.");
        }
        return playerChoose;
    }

    public int userInput() {

        boolean inputIsInvalid = true;

        int input = 0;

        while (inputIsInvalid) {
            input = testInput();

            if (input != 0) {
                inputIsInvalid = false;
            }
        }
        return input;
    }


    public void chooseBox(boolean player) {

        boolean tryAgain = true;

        while (tryAgain) {

            // player choose what box to mark and if it is a valid box

            int playerChoose = userInput();
            char symbol;
            if (player) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }
            switch (playerChoose) {
                case 1:
                    if (layer[0][0] == ' ') {
                        layer[0][0] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                case 2:
                    if (layer[0][2] == ' ') {
                        layer[0][2] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                case 3:
                    if (layer[0][4] == ' ') {
                        layer[0][4] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                case 4:
                    if (layer[2][0] == ' ') {
                        layer[2][0] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                case 5:
                    if (layer[2][2] == ' ') {
                        layer[2][2] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                case 6:
                    if (layer[2][4] == ' ') {
                        layer[2][4] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                case 7:
                    if (layer[4][0] == ' ') {
                        layer[4][0] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                case 8:
                    if (layer[4][2] == ' ') {
                        layer[4][2] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                case 9:
                    if (layer[4][4] == ' ') {
                        layer[4][4] = symbol;
                        tryAgain = false;
                    } else {
                        System.out.println(" Spot is already marked, please choose another spot");
                    }
                    break;

                default:
                    System.out.println(playerChoose + " please write an number between 1-9 and that is not taken.");
                    break;
            }
        }
    }

    public boolean checkIfTie() {
        boolean isGameTie = false;

        //check if none of player has won
        if ((layer[0][0] == 'X' || layer[0][0] == 'O') && (layer[0][2] == 'X' || layer[0][2] == 'O') && (layer[0][4] == 'X' || layer[0][4] == 'O') && (layer[2][0] == 'X' || layer[2][0] == 'O') && (layer[2][2] == 'X' || layer[2][2] == 'O') && (layer[2][4] == 'X' || layer[2][4] == 'O') && (layer[4][0] == 'X' || layer[4][0] == 'O') && (layer[4][2] == 'X' || layer[4][2] == 'O') && (layer[4][4] == 'X' || layer[4][4] == 'O')) {
            System.out.println("TIE, NO WINNER!");
            isGameTie = true;
        }
        return isGameTie;
    }


    //This method checks if a player has three of the same symbols

    public boolean checkWin(boolean player, String playerName) {

        char symbol;

        if (player) {
            symbol = 'X';
            playerPos.add(symbol);
        } else {
            symbol = 'O';
            playerPos.add(symbol);
        }
        boolean isGameOver = false;


        // check if player wins (horizontal)

        if (layer[0][0] == symbol && layer[0][2] == symbol && layer[0][4] == symbol) {
            System.out.println(playerName + " have won!");
            isGameOver = true;

        } else if (layer[2][0] == symbol && layer[2][2] == symbol && layer[2][4] == symbol) {
            System.out.println(playerName + " have won!");
            isGameOver = true;

        } else if (layer[4][0] == symbol && layer[4][2] == symbol && layer[4][4] == symbol) {
            System.out.println(playerName + " have won!");
            isGameOver = true;


            // check if player wins (vertically)

        } else if (layer[0][0] == symbol && layer[2][0] == symbol && layer[4][0] == symbol) {
            System.out.println(playerName + " have won!");
            isGameOver = true;

        } else if (layer[0][2] == symbol && layer[2][2] == symbol && layer[4][2] == symbol) {
            System.out.println(playerName + " have won!");
            isGameOver = true;

        } else if (layer[0][4] == symbol && layer[2][4] == symbol && layer[4][4] == symbol) {
            System.out.println(playerName + " have won!");
            isGameOver = true;


            // check if player wins (diagonal)

        } else if (layer[0][0] == symbol && layer[2][2] == symbol && layer[4][4] == symbol) {
            System.out.println(playerName + " have won!");
            isGameOver = true;

        } else if (layer[0][4] == symbol && layer[2][2] == symbol && layer[4][0] == symbol) {
            System.out.println(playerName + " have won!");
            isGameOver = true;
        } else {
            isGameOver = checkIfTie();
        }
        if (isGameOver) {

            printBoard();

        }
        return !isGameOver;
    }

    public void resGame() {

        // Printing out new board to continue game

        layer[0][0] = ' ';
        layer[0][2] = ' ';
        layer[0][4] = ' ';

        layer[2][0] = ' ';
        layer[2][2] = ' ';
        layer[2][4] = ' ';

        layer[4][0] = ' ';
        layer[4][2] = ' ';
        layer[4][4] = ' ';
    }
}