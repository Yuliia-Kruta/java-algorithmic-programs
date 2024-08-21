import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class InfString {
    private Map<Integer, Character> notEmptyCells;

    public InfString(String input) {
        notEmptyCells = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            notEmptyCells.put(i, input.charAt(i));
        }
    }

    public char getCharAt(int i) {
        return (notEmptyCells.containsKey(i)) ? notEmptyCells.get(i) : '_';
    }

    public void setCharAt(int i, char c) {
        notEmptyCells.put(i, c);
    }

    public String getWholeString() {
        TreeSet<Integer> indexes = new TreeSet<>(notEmptyCells.keySet());
        int minValue = indexes.first();
        int maxValue = indexes.last();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = minValue; i <= maxValue; i++) {
            stringBuilder.append(getCharAt(i));
        }
        return stringBuilder.toString().replace("_", " ").trim();
    }
}