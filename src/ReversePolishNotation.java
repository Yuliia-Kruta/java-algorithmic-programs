import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class ReversePolishNotation {
    Stack stack = new Stack();
    private boolean gapTrig = false;
    private int check;

    public static void main(String[] args) {
        ReversePolishNotation rpn = new ReversePolishNotation();
        rpn.start();
    }

    public void start() {
        try {
            FileReader fr = new FileReader("RPN_InputFile.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("RPN_OutputFile.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            ArrayList<String> strings = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                strings.add(line);
            }
            for (String s : strings) {
                for (int i = 0; i < s.length(); i++) {
                    char curSymb = s.charAt(i);
                    String stackSymb;
                    switch (curSymb) {
                        case '(':
                            stack.push(curSymb);
                            break;
                        case ')':
                            while (!(stackSymb = String.valueOf(stack.peek())).equals("(")) {
                                bw.write(" ");
                                bw.write(stackSymb);
                                gapTrig = true;
                                stack.pop();
                            }
                            stack.pop();
                            break;
                        case '+':
                        case '-':
                        case '*':
                        case '/':
                            if (!stack.empty()) {
                                check = priorityCheck2(curSymb, stack.peek());
                                while(check!=0 && !stack.empty()){
                                    bw.write(" ");
                                    bw.write(String.valueOf(stack.pop()));
                                    if(stack.empty())break;
                                    priorityCheck2(curSymb, stack.peek());
                                }
                                stack.push(curSymb);
                            } else {
                                stack.push(curSymb);
                            }
                            gapTrig = true;
                            break;
                        default:
                            if (gapTrig) {
                                bw.write(" ");
                            }
                            bw.write(curSymb);
                            gapTrig = false;
                    }
                }
                while (!stack.empty()) {
                    bw.write(" ");
                    bw.write(String.valueOf(stack.pop()));
                }
                bw.write("\n");
            }
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int priorityCheck2(char curSymb, Object stackTop) {
        if (curSymb == '*' || curSymb == '/') {
            if ((char)stackTop == '*' || (char)stackTop == '/') {
                check = 1;
            } else {
                check = 0;
            }
        }
        if (curSymb == '+' || curSymb == '-') {
            if (((char)stackTop == '*' ||  (char)stackTop == '/') || ( (char)stackTop == '+' ||  (char)stackTop == '-')) {
                check = 1;
            } else {
                check = 0;
            }
        }
        return check;
    }
}