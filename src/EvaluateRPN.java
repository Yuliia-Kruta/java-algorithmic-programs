import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class EvaluateRPN {
    Stack stack = new Stack();
    ArrayList<String> varNames = new ArrayList<>();
    ArrayList<String> varValues = new ArrayList<>();

    public static void main(String[] args) {
        EvaluateRPN rpn = new EvaluateRPN();
        rpn.start();
    }
    public void start() {
        try {
            FileReader fr = new FileReader("RPN_Input.txt");
            BufferedReader br = new BufferedReader(fr);

            ArrayList<String> strings = new ArrayList<>();
            ArrayList<String> newStrings = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                strings.add(line);
            }
            if (strings.size() > 1) addVars(strings);
            String s = strings.get(0);
            StringTokenizer polRev = new StringTokenizer(s);
            String curSymb;
            while (polRev.hasMoreElements()) {
                curSymb = polRev.nextToken();
                if (varNames.contains(curSymb)) {
                    int varIndex = varNames.indexOf(curSymb);
                    curSymb = varValues.get(varIndex);
                }
                newStrings.add(curSymb);

            }
            for (int i = 0; i<newStrings.size(); i++) {
                curSymb = newStrings.get(i);
                switch (curSymb) {
                    case "+":
                        double last = (double) stack.pop();
                        double result = (double) stack.pop() + last;
                        stack.push(result);
                        break;
                    case "-":
                        last = (double) stack.pop();
                        result = (double) stack.pop() - last;
                        stack.push(result);
                        break;
                    case "*":
                        last = (double) stack.pop();
                        result = (double) stack.pop() * last;
                        stack.push(result);
                        break;
                    case "/":
                        last = (double) stack.pop();
                        result = (double) stack.pop() / last;
                        stack.push(result);
                        break;
                    default:
                        stack.push((double)Integer.parseInt(curSymb));
                        break;
                }

            }
            System.out.println("The result is "+stack.peek());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addVars(ArrayList<String> strings) {
        for(int i = 1; i<strings.size(); i++){
            String lineWithVars = strings.get(i);
            StringTokenizer tokens = new StringTokenizer(lineWithVars);
            String nameOfVar = tokens.nextToken();
            varNames.add(nameOfVar);
            tokens.nextToken();
            String valueOfVar = tokens.nextToken();
            varValues.add(valueOfVar);
        }
    }
}