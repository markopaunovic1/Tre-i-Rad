import java.util.Arrays;
import java.util.Scanner;

public class Board {

    public Board() {

        Scanner input = new Scanner(System.in);

        switch (input.nextInt()) {

            case 1:
            char[][] layer = {{' ', '║', ' ', '║', ' '},
                              {'═', '╬', '═', '╬', '═',},
                              {' ', ' ', ' ', ' ', ' '},
                              {'═', '╬', '═', '╬', '═'},
                              {' ', '║', ' ', '║', ' '}};

            for (char[] eachRow : layer) {
                for (char c : eachRow) {
                    System.out.print(c);
                }
                System.out.println();
            }
            case 2:
        }
    }
}