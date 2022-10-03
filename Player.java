public class Player extends Board {

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
        this.turn = turn;
    }
    public boolean isTurn(boolean turn) {
        this.turn = turn;
        return false;
    }
}
