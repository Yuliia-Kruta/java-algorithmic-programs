import java.util.regex.Pattern;

public class CalcMultiplication {
    public static void main(String[] args) {
        String[][] states = {{"a|", "|ba"},{"a", ""},{"b|", "|b"},{"|*", "*a"},{"*", "c"},{"c|", "c"},{"cb", "|c"},{"c", "."}};
        String str = "||||*|||";
        System.out.println(rec(str, states));
    }
    public static String rec(String namEnter, String[][] states){
        boolean shouldRepeat = true;
        System.out.println(namEnter);
        if (shouldRepeat = false){
            return namEnter;
        }
        else{
            shouldRepeat=false;
            for (String[] state : states) {
                if (namEnter.contains(state[0])) {
                    shouldRepeat = true;
                    namEnter = namEnter.replaceFirst(Pattern.quote(state[0]), state[1]);
                    if (state[1].contains(".")) {
                        return namEnter.replace(".", "");
                    }
                    return rec(namEnter, states);
                }
            }
            return rec(namEnter, states);
        }
    }
}
