public class Player {
    char symbol;
    String name;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    public String getName(String name) {
        this.name = name;
        return name;
    }
}