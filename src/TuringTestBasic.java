import java.util.*;

public class TuringTestBasic {
    public static void main(String[] args) {
        LinkedHashSet<Character> alphabet = new LinkedHashSet<>(Arrays.asList('0', '1', '_'));
        int[] states = {1, 2};
        Rule[][] rules = new Rule[alphabet.size()][states.length];
        rules[2][0] = new Rule('_', Move.R, 1);
        rules[0][1] = new Rule('1', Move.R, 1);
        rules[1][1] = new Rule('0', Move.R, 1);
        rules[2][1] = new Rule('_', Move.N, -1);        // go to state -1 = stop

        // startIndex = -1 means start before the input word
        TuringMachine turingMachine = new TuringMachine(alphabet, rules, "11100010", -1);
        System.out.println(turingMachine.run());
    }
}






