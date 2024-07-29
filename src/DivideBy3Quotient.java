import java.util.regex.Pattern;

public class DivideBy3Quotient {
    public static void main(String[] args){
        String[][] states={{"|||","a"},{"a|","a"},{"baaaaaaaaaa","ab"},{"baaaaaaaaa","9"},
                {"baaaaaaaa","8"},{"baaaaaaa","7"},{"baaaaaa","6"},{"baaaaa","5"},{"baaaa","4"},
                {"baaa","3"},{"baa","2"},{"ba","1"},{"b","0"},{"a","ba"}};
        String str="||||||||";
        System.out.println(divide3Quatient(str,states));
    }
    public static String divide3Quatient(String namEnter, String[][] states){
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
