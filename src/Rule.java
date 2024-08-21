public class Rule {
    private char replace;
    private Move move;
    private int goTo;

    public Rule(char replace, Move move, int goTo) {
        this.replace = replace;
        this.move = move;
        this.goTo = goTo;
    }

    public char getReplace() {
        return replace;
    }

    public Move getMove() {
        return move;
    }

    public int getGoTo() {
        return goTo;
    }
}