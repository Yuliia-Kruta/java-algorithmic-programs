import java.util.regex.Pattern;

public class CalcMultiplicationExpr {
    public static void main(String[] args){
        String[][] states={{"+",""},{"|-|","-"},{")",""},{"(",""},{"a|","|ba"},{"b|","|b"},{"a",""},{"|*","*a"},{"*","c"},{"c|","c"},{"cb","|c"},{"c","."}};
        String str="(||||+||)*(|+|||)";
        System.out.println(expression3(str,states));
    }
    public static String expression3(String namEnter, String[][] states){
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
