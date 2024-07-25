import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.println("Enter a positive integer (let's call it n):");
            int n = myScanner.nextInt();
            while (n != 1) {
                if (n % 2 == 0) {
                    System.out.println("The number n is even, so divide it by 2:");
                    n /= 2;
                    System.out.println("n/2 = " + n + " - this is the new number n");
                } else {
                    System.out.println("The number n is odd, so multiply it by 3 and add 1:");
                    n = n * 3 + 1;
                    System.out.println("n*3+1 = " + n + " - this is the new number n");
                }
            }

            System.out.println("The number n is 1, so the algorithm execution process ends.");

        } finally {
            myScanner.close();
        }
    }
}

