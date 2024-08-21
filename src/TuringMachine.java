import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TuringMachine {
    ArrayList<Character> alphabet;
    Rule[][] rules;
    InfString infString;
    int currentIndex;
    int currentAlphabetIndex;
    int currentStateIndex;

    public TuringMachine(LinkedHashSet<Character> alphabet, Rule[][] rules, String inputString, int startIndex) {
        this.alphabet = new ArrayList<>(alphabet);
        this.rules = rules;
        this.infString = new InfString(inputString);
        this.currentIndex = startIndex;
        this.currentStateIndex = 0;
    }

    public String run() {
        while (currentStateIndex!=-1){
            char currentSymbol = infString.getCharAt(currentIndex);
            currentAlphabetIndex = alphabet.indexOf(currentSymbol);
            Rule currentRule = rules[currentAlphabetIndex][currentStateIndex];
            currentStateIndex=currentRule.getGoTo();
            infString.setCharAt(currentIndex,currentRule.getReplace());
            if(currentRule.getMove()==Move.R){
                currentIndex++;
            }
            if(currentRule.getMove()==Move.L){
                currentIndex--;
            }
            System.out.println(infString.getWholeString());
        }
        return infString.getWholeString();
    }
    public String runEx3() {
        while (currentStateIndex != -1) {
            char currentSymbol = infString.getCharAt(currentIndex);
            currentAlphabetIndex = alphabet.indexOf(currentSymbol);
            Rule currentRule = rules[currentAlphabetIndex][currentStateIndex];
            currentStateIndex = currentRule.getGoTo();
            infString.setCharAt(currentIndex, currentRule.getReplace());
            if (currentRule.getMove() == Move.R) {
                currentIndex++;
            }
            if(currentRule.getMove()== Move.L){
                currentIndex--;
            }
            System.out.println(infString.getWholeString());
        }
        System.out.println(currentIndex);

        return infString.getWholeString();
    }
}