package ForLoop.MoreExercise;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        int diff = 0;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven = a + b;
            } else {
                sumOdd = a + b;
            }
            if (sumEven != sumOdd && n != 1 && i != 0) {
                diff = Math.abs(sumEven - sumOdd);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        if (sumEven != sumOdd && n != 1) {
            System.out.printf("No, maxdiff=%d", maxDiff);
        } else {
            System.out.printf("Yes, value=%d", sumEven);
        }
    }
}
