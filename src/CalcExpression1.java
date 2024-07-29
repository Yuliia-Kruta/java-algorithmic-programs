import java.util.regex.Pattern;

public class CalcExpression1 {
    public static void main(String[] args){
        String[][] states={{"+",""},{"|-|","-"},{")",""},{"(",""},{"-|","|"},{"|-","|."},{"-","0."}};
        String str="||||||-(||||+||)";
        System.out.println(expression1(str,states));
    }
    public static String expression1(String namEnter, String[][] states){
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