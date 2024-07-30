import java.util.regex.Pattern;

public class CalcExpression {
    public static void main(String[] args){
        String[][] states={{"+",""},{"|-|","-"},{")",""},{"(",""},{"|-","|."},{"-|","negative |"},{"-","0."}};
        String str="||||||||-(||||+||)";
        System.out.println(expression2(str,states));
    }
    public static String expression2(String namEnter, String[][] states){
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
