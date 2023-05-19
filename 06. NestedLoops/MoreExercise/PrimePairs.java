package NestedLoops.MoreExercise;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginningFirst = Integer.parseInt(scanner.nextLine());
        int beginningSecond = Integer.parseInt(scanner.nextLine());
        int firstDiff = Integer.parseInt(scanner.nextLine());
        int secondDiff = Integer.parseInt(scanner.nextLine());
        for (int i = beginningFirst; i <= firstDiff + beginningFirst; i++) {
            for (int j = beginningSecond; j <= beginningSecond + secondDiff; j++) {
                int countFirst = 0;
                int countSecond = 0;
                for (int k = 1; k <= i; k++) {
                    if (i % k == 0) {
                        countFirst++;
                    }
                }
                for (int k = 1; k <= j; k++) {
                    if (j % k == 0) {
                        countSecond++;
                    }
                }
                if (countFirst == 2 && countSecond == 2) {
                    System.out.printf("%d%d\n", i, j);
                }
            }
        }
    }
}
