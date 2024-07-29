import java.util.regex.Pattern;

public class FindRemainder {
    public static void main(String[] args){
        String[][] states={{"|:0",":0"},{":0","0."},{":","abcd"},{"d|","Dd"},{"d",""},{"|D","D|"},{"cD","|c|"},{"|a","a|"},{"|b|","b"},{"bc","bcd"},
                {"ab","e"},{"e|","|e"},{"|ec|","ec"},{"ec","."}};
        String str="||||||||:|||";
        System.out.println(dividedRemainder(str,states));
    }
    public static String dividedRemainder(String namEnter, String[][] states){
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
