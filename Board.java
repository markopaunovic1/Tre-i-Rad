import java.util.*;

public class Board {

    static ArrayList<Character> playerPos = new ArrayList<>();

    Player p1 = new Player("P1", 'X');
    Player p2 = new Player("P2", 'O');
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

        System.out.println("player value:" + player);
        Scanner input = new Scanner(System.in);
        int playerChoose = input.nextInt();

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
                } break;
            case 2:
                if (layer[0][2] == ' ') {
                    layer[0][2] = symbol;
                } break;
            case 3:
                if (layer[0][4] == ' ') {
                    layer[0][4] = symbol;
                } break;

            case 4:
                if (layer[2][0] == ' ') {
                    layer[2][0] = symbol;
                } break;
            case 5:
                if (layer[2][2] == ' ') {
                    layer[2][2] = symbol;
                } break;
            case 6:
                if (layer[2][4] == ' ') {
                    layer[2][4] = symbol;
                } break;

            case 7:
                if (layer[4][0] == ' ') {
                    layer[4][0] = symbol;
                } break;
            case 8:
                if (layer[4][2] == ' ') {
                    layer[4][2] = symbol;
                } break;
            case 9:
                if (layer[4][4] == ' ') {
                    layer[4][4] = symbol;
                } break;

            default:
                System.out.println(playerChoose + " Is not a valid number, only 1-9");
                  break;
        }
    }
    public void checkWin(boolean player) {

        char symbol;

        if (player) {
            symbol = 'X';
            playerPos.add(symbol);
        } else {
            symbol = 'O';
            playerPos.add(symbol);
        }

        List<Character> row1 = List.of(symbol);
        List<Character> row2 = List.of(symbol);
        List<Character> row3 = List.of(symbol);

        List<Character> column1 = List.of(symbol);
        List<Character> column2 = List.of(symbol);
        List<Character> column3 = List.of(symbol);

        List<Character> diag1 = List.of(symbol);
        List<Character> diag2 = List.of(symbol);

        ArrayList<List<Character>> winner = new ArrayList<>();

        winner.add(row1);
        winner.add(row2);
        winner.add(row3);

        winner.add(column1);
        winner.add(column2);
        winner.add(column3);

        winner.add(diag1);
        winner.add(diag2);

        for (List<Character> i : winner) {
            if (playerPos.contains((i))) {
                System.out.println("you won!");
            }
        }
             // check if player wins (horizontal)
        /*
        if (layer[0][0] == symbol && layer[0][2] == symbol && layer[0][4] == symbol) {
            System.out.println(player + " You have won!");

        } else if (layer[2][0]  == symbol && layer[2][2]  == symbol && layer[2][4]  == symbol) {
            System.out.println(player + " You have won!");

        } else if (layer[4][0]  == symbol && layer[4][2]  == symbol && layer[4][4]  == symbol) {
            System.out.println(player + " You have won!");


            // check if player wins (vertically)

        }else if (layer[0][0] == symbol && layer[2][0] == symbol && layer[4][0] == symbol) {
            System.out.println(player + " You have won!");

        } else if (layer[0][2]  == symbol && layer[2][2]  == symbol && layer[4][2]  == symbol) {
            System.out.println(player + " You have won!");

        }else if (layer[0][4]  == symbol && layer[2][4]  == symbol && layer[4][4]  == symbol) {
                    System.out.println(player + " You have won!");


            // check if player wins (diagonal)

        } else if (layer[0][0]  == symbol && layer[2][2]  == symbol && layer[4][4]  == symbol) {
            System.out.println(player + " You have won!");

        }else if (layer[0][4]  == symbol && layer[2][2]  == symbol && layer[4][0]  == symbol) {
            System.out.println(player + " You have won!");
        }

         */
    }
}





