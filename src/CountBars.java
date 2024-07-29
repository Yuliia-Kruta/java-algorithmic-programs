import java.util.regex.Pattern;

public class CountBars {
    public static void main(String[] args){
        String[][] states={{"a||||||||||","|a"},{"a|||||||||","9"},{"a||||||||","8"},{"a|||||||","7"},{"a||||||","6"},
                {"a|||||","5"},{"a||||","4"},{"a|||","3"},{"a||","2"},{"a|","1"},{"a","0"},{"|","a|"}};
        String str="|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
        System.out.println(transferIn10(str,states));
    }
    public static String transferIn10(String namEnter, String[][] states){
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
