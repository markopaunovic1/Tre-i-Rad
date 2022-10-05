import java.util.Scanner;

public class Board {

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

    public void chooseBox(boolean player) {

        System.out.println("player value:" +player);
        Scanner input = new Scanner(System.in);
        int playerChoose = input.nextInt();

        char symbol = ' ';

        if (player) {
            symbol = 'X';
        } else {
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


