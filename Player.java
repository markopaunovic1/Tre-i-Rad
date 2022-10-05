public class Player  {

    char symbol;
    String name;
    boolean turn;


    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;

    }

    public String getName(String name) {
        this.name = name;
        return name;
    }

    public void  getSymbol(char symbol) {
        this.symbol = symbol;

    }
    public boolean isTurn(boolean turn) {
        this.turn = turn;
        return false;
    }
}
