import java.util.regex.Pattern;

public class ClearEndSymb {
    public static void main(String[] args){
        String[][] states={{"|b","b|"},{"|a","a|"},{"b|","."},{"a|","."},{"","|"}};
        String str="abbbbbb";
        System.out.println(clearEndOne(str,states));
    }
    public static String clearEndOne(String namEnter, String[][] states){
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
                    return clearEndOne(namEnter, states);
                }
            }
            return clearEndOne(namEnter, states);
        }
    }
}