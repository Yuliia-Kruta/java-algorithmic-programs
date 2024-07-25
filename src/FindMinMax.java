import java.util.Scanner;

public class FindMinMax {
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        String str;
        final String STOP = "0";
        int i = 0, j = 0, x;
        boolean first = true;
        System.out.println("Enter integer numbers, the program will find the largest and smallest among them. To "+
                "start the program, finish entering numbers by entering 0 ");
        while(true) {
            str = myScanner.next();
            if (str.equals(STOP)) {
                break;
            }
            x = Integer.parseInt(str);
            if(first){
                i = j = x;
                first = false;
            }
            else {
                if (i > x) {
                    i = x;
                }
                if (j < x) {
                    j = x;
                }
            }
        }
        if (first) {
            System.out.println("The program did not execute because no numbers were entered");
        }
        else {
            System.out.println("Smallest number: " + i);
            System.out.println("Largest number: " + j);
        }
    }
}

