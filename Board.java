import java.util.Arrays;
import java.util.Scanner;

public class Board {

    public Board() {

        Scanner input = new Scanner(System.in);

        switch (input.nextInt()){

        }

        char[][] layer =  { { ' ', '│', ' ', '│', ' ' },
                                 { '―', '―', '―',},
                            { ' ', '│', ' ', '│', ' ' },
                                 { '―', '―', '―',},
                            { ' ', '│', ' ', '│', ' ' }};

        for (char[] eachRow : layer) {
            for(char c : eachRow){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
