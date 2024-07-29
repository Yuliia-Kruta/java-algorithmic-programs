import java.util.regex.Pattern;

public class GCD {
    public static void main(String[] args){
        String[][] states={{" і ",""},{"*a","%a"},{"*b","%b"},{"*c","&c"},{"%a","a%"},{"%b","a%"},{"%c","b%"},{"%",""},
                {"&c","a&"},{"&","."},{"cb","bc"},{"ab","c"},{"","*"}};
        String str="aa і bbbbbbbb";
        System.out.println(gcd(str,states));
    }
    public static String gcd(String namEnter, String[][] states){
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
