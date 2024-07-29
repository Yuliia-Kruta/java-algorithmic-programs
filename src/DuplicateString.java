import java.util.regex.Pattern;

public class DuplicateString {
    public static void main(String[] args){
        String[][] states={{"*a","aA*"},{"*b","bB*"},{"*","#"},{"Aa","aA"},{"Ab","bA"},{"Ba","aB"},{"Bb","bB"},{"A#","#a"},{"B#","#b"},{"#","."},{"","*"}};
        String str="abb";
        System.out.println(copyWord(str,states));
    }
    public static String copyWord(String namEnter, String[][] states){
        boolean shouldRepeat = true;
        while(shouldRepeat){
            shouldRepeat=false;
            System.out.println(namEnter);
            for (String[] state : states) {
                if (namEnter.contains(state[0])) {
                    shouldRepeat = true;
                    namEnter = namEnter.replaceFirst(Pattern.quote(state[0]), state[1]);
                    if (state[1].contains(".")) {
                        return namEnter.replace(".", "");
                    }
                    break;
                }
            }
        }
        return namEnter;
    }
}
