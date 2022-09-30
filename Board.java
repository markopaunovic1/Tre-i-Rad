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

    public void chooseBox() {

        Scanner input = new Scanner(System.in);

        int playerChoose = input.nextByte();
        System.out.println(playerChoose);


        switch (playerChoose) {
            case 1:
                layer[0][0] = 'O';
                break;
            case 2:
                layer[0][2] = 'X';
                break;
            case 3:
                layer[0][4] = 'X';
                break;
            case 4:
                layer[2][0] = 'X';
                break;
            case 5:
                layer[2][2] = 'X';
                break;
            case 6:
                layer[2][4] = 'X';
                break;
            case 7:
                layer[4][0] = 'X';
                break;
            case 8:
                layer[4][2] = 'X';
                break;
            case 9:
                layer[4][4] = 'X';
                break;
        }
    }
}
