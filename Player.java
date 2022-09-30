import java.util.Scanner;

public class Player {

    String symbol;
    String name;

    boolean turn;

    public String getName(String name) {
        this.name = name;
        return name;
    }

    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;

    }
}
