public class AmicableNumbers {
    public static void main(String[] args) {
        int rangeLimit = 20000;
        int n = 2, a, b, p, q, r;
        while (true) {
            p = 3 * (int)(Math.pow(2,n-1)) - 1;
            q = 3 * (int)(Math.pow(2, n)) - 1;
            r = 9 * (int)(Math.pow(2, 2 * n - 1)) - 1;
            boolean f = true;
            int i;
            for (i = 2; (i < p && i < q) && i < r; i++) {
                if ((p % i == 0 && q % i == 0) && r % i == 0) {
                    f = false;
                    break;
                }
            }
            if (f) {
                a = (int)(Math.pow(2, n)) * p * q;
                b = (int)(Math.pow(2, n)) * r;
                if (a < rangeLimit && b < rangeLimit) {
                    System.out.println(a + " " + " " + b);
                } else {
                    break;
                }
            }
            n++;
        }
    }
}