import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    char[][] layer = {{' ', '║', ' ', '║', ' '},
            {'═', '╬', '═', '╬', '═',},
            {' ', '║', ' ', '║', ' '},
            {'═', '╬', '═', '╬', '═'},
            {' ', '║', ' ', '║', ' '}};

    ArrayList<String> users = new ArrayList<>();

    public void printBoard() {

        for (char[] eachRow : layer) {
            for (char c : eachRow) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void chooseBox(String name) {

        Scanner input = new Scanner(System.in);

        Player p1 = new Player("P1", "X");
        Player p2 = new Player("P2", "O");

        int playerChoose = input.nextInt();

        users.add(p1.name);
        users.add(p2.name);

        char symbol = ' ';

        if (playerChoose == (symbol)) {
            symbol = 'X';
        } else  {
            symbol = 'O';
        }


        switch (playerChoose) {
            case 1:
                layer[0][0] = symbol;
                break;
            case 2:
                layer[0][2] = symbol;
                break;
            case 3:
                layer[0][4] = symbol;
                break;
            case 4:
                layer[2][0] = symbol;
                break;
            case 5:
                layer[2][2] = symbol;
                break;
            case 6:
                layer[2][4] = symbol;
                break;
            case 7:
                layer[4][0] = symbol;
                break;
            case 8:
                layer[4][2] = symbol;
                break;
            case 9:
                layer[4][4] = symbol;
                break;
            default:
                System.out.println(playerChoose + " Is not a valid number, only 1-9");
                break;
        }
    }
}

