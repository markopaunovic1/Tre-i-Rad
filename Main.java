import java.util.Scanner;

public class Main {
    static Board board = new Board();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcoming the players to the game, and asking for their names

        Player p1 = new Player("P1", 'X');
        Player p2 = new Player("P2", 'O');

        System.out.println("Welcome to Tic-Tac-Toe ❌/\uD83D\uDFE2");
        System.out.println();

        System.out.println("Player 1, whats your name?");
        p1.getName(input.nextLine());

        System.out.println("Player 2, whats your name? ");
        p2.getName(input.nextLine());

        boolean isPlayer1 = true;


        do {
            boolean shouldGameContinue = true;

            while (shouldGameContinue) {
                board.printBoard();

                // Each player values if its true or false

                if (isPlayer1) {
                    System.out.println(p1.name + ", Choose a number between 1-9");
                    board.chooseBox(isPlayer1);

                    if (board.checkWin(isPlayer1, p1.name)) {

                    } else {
                        System.out.println();
                        System.out.println("Do you want to continue? (Y/N)");

                        String answer = input.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            System.out.println("New Game");

                        } else {
                            System.exit(0);
                        }
                        board.resGame();
                        break;
                    }

                    isPlayer1 = false;

                } else {
                    System.out.println(p2.name + ", Choose a number between 1-9");
                    board.chooseBox(isPlayer1);

                    if (board.checkWin(isPlayer1, p2.name)) {

                    } else {
                        System.out.println();
                        System.out.println("Do you want to continue? (Y/N)");

                        String answer = input.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            System.out.println("New Game");

                        } else {
                            System.exit(0);
                        }
                        board.resGame();
                        break;
                    }
                    shouldGameContinue = board.checkWin(isPlayer1, p2.name);
                    isPlayer1 = true;
                }
            }
        } while (true);
    }
}