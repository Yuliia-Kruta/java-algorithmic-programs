import java.util.*;

public class TuringTestAdvanced {

    public static void main(String[] args) {
        LinkedHashSet<Character> alphabet = new LinkedHashSet<>(Arrays.asList('a', 'b', '_','Н','|'));
        int[] states = {1, 2,3,4};

        //Ex1

        Rule[][] rulesEx1 = new Rule[alphabet.size()][states.length];
        rulesEx1[2][0] = new Rule('_', Move.R, 1);
        rulesEx1[0][1] = new Rule('a', Move.R, 1);
        rulesEx1[1][1] = new Rule('b', Move.R, 1);
        rulesEx1[2][1] = new Rule('_', Move.L, 0);
        rulesEx1[0][0] = new Rule('_', Move.N, -1);
        rulesEx1[1][0] = new Rule('_', Move.N, -1);

        //TuringMachine clearEndOne = new TuringMachine(alphabet, rulesEx1, "abba", -1);
        //System.out.println(clearEndOne.run());

        //Ex2

        Rule[][] rulesEx2 = new Rule[alphabet.size()][states.length];
        rulesEx2[2][0] = new Rule('_', Move.R, 1);
        rulesEx2[2][1] = new Rule('_', Move.N, -1);
        rulesEx2[0][1] = new Rule('a', Move.R, 2); //for first a
        rulesEx2[1][1] = new Rule('b', Move.R, 3); //for first b
        rulesEx2[0][2] = new Rule('a', Move.R, 2);
        rulesEx2[1][2] = new Rule('b', Move.R, 2);
        rulesEx2[2][2] = new Rule('a', Move.N, -1);
        rulesEx2[0][3] = new Rule('a', Move.R, 3);
        rulesEx2[1][3] = new Rule('b', Move.R, 3);
        rulesEx2[2][3] = new Rule('b', Move.N, -1);

        //TuringMachine addEndOne = new TuringMachine(alphabet, rulesEx2, "abb", -1);
        //System.out.println(addEndOne.run());

        //Ex3

        Rule[][] rulesEx3 = new Rule[alphabet.size()][states.length];
        rulesEx3[2][0] = new Rule('_', Move.R, 1);
        rulesEx3[2][1] = new Rule('_', Move.N, -1);
        rulesEx3[4][1] = new Rule('_', Move.R, 1);

        //TuringMachine transferIn10 = new TuringMachine(alphabet, rulesEx3, "|||", -1);
        //System.out.println(transferIn10.runEx3());
    }
}





