import java.util.Scanner;

public class Main {
    static Board board = new Board();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Player p1 = new Player("P1", 'X');
        Player p2 = new Player("P2", 'O');


        System.out.println("Welcome to Tic-Tac-Toe ❌/\uD83D\uDFE2");
        System.out.println();

        System.out.println("Player 1, whats your name?");
        p1.getName(input.nextLine());

        System.out.println("Player 2, whats your name? ");
        p2.getName(input.nextLine());

        boolean isPlayer1 = true;


        while (true) {

            if (isPlayer1) {
                board.printBoard();
                System.out.println(p1.name + ", Choose a number between 1-9");
                board.chooseBox(isPlayer1);
                board.checkWin(isPlayer1);
                isPlayer1 = false;


            } else {
                board.printBoard();
                System.out.println(p2.name + ", Choose a number between 1-9");
                board.chooseBox(isPlayer1);
                board.checkWin(isPlayer1);
                isPlayer1 = true;
            }
        }
    }
}

