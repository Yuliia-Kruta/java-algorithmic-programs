import java.util.regex.Pattern;

public class AddEndSymbol {
    public static void main(String[] args){
        String[][] states={{"|b","bd"},{"|a","ac"},{"ca","ac"},{"cb","bc"},{"da","ad"},{"db","bd"},{"c","a."},{"d","b."},{"","|"}};
        String str="bbbbbb";
        System.out.println(addEndOne(str,states));
    }
    public static String addEndOne(String namEnter, String[][] states){
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
                    return addEndOne(namEnter, states);
                }
            }
            return addEndOne(namEnter, states);
        }
    }
}
