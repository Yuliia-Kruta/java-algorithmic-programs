import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PermutationSum {
    private static int counter = 0;
    ArrayList<String> permutationsList = new ArrayList<String>();

    public static void main(String[] args){
        PermutationSum program = new PermutationSum();
        program.start();
    }

    public void start(){
        String a="";
        String b="";
        String c="";
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter numbers: A, B, C - natural numbers");
                String input = scanner.nextLine();
                StringTokenizer inputTokens = new StringTokenizer(input);

                if (inputTokens.countTokens() != 3) {
                    System.out.println("Please enter exactly three numbers.");
                    continue;
                }

                try {
                    a = inputTokens.nextToken();
                    b = inputTokens.nextToken();
                    c = inputTokens.nextToken();

                    if (isValidNumber(a) && isValidNumber(b) && isValidNumber(c)) {
                        break;
                    } else {
                        System.out.println("You entered numbers out of the allowed range. Try again");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter natural numbers.");
                }
            }
        }
        generatePermutationsA("", a, b, c);
        if(counter == 0) System.out.println("NO");
        else System.out.println("Number of possible solutions: " + counter);
    }
    public boolean isValidNumber(String num) {
        int value = Integer.parseInt(num);
        return value > 0 && value < 1000000000;
    }

    public void generatePermutationsA(String res, String a, String b, String c) {
        int n = a.length();
        if (n == 0) {
            generatePermutationsB("", b, res, c);
        } else {
            for (int i = 0; i < n; i++)
                generatePermutationsA(res + a.charAt(i), a.substring(0, i) + a.substring(i+1, n), b, c);
        }
    }

    public void generatePermutationsB(String res, String b, String a, String c) {
        int n = b.length();
        if (n == 0) {
            if(Integer.parseInt(res)+Integer.parseInt(a)==Integer.parseInt(c)) {
                String str = new StringBuilder().append(a).append(res).toString();
                if (!permutationsList.contains(str)) permutationsList.add(str);
                System.out.println(a + " " + res);
                counter++;
            }
        } else {
            for (int i = 0; i < n; i++)
                generatePermutationsB(res + b.charAt(i), b.substring(0, i) + b.substring(i+1, n), a, c);
        }
    }
}
