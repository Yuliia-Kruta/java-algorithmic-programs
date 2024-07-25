import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disks:");

        if (scanner.hasNextInt()) {
            int numberOfDisks = scanner.nextInt();

            if (numberOfDisks > 0) {
                moveDisks('A', 'C', 'B', numberOfDisks);
            } else {
                System.out.println("The number of disks must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }

    public static void moveDisks(char source, char target, char auxiliary, int disks) {
        if (disks == 1) {
            System.out.println("Move disk from " + source + " to " + target);
        } else {
            moveDisks(source, auxiliary, target, disks - 1);
            System.out.println("Move disk from " + source + " to " + target);
            moveDisks(auxiliary, target, source, disks - 1);
        }
    }
}
