package ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }

        }
        System.out.printf("Max number: %d\nMin number: %d", maxNumber, minNumber);
    }
}
