package NestedLoops.MoreExercise;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hundredTop = Integer.parseInt(scanner.nextLine());
        int tensTop = Integer.parseInt(scanner.nextLine());
        int onesTop = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= hundredTop; i++) {
            for (int j = 1; j <= tensTop; j++) {
                int count = 0;
                for (int k = 1; k <= j; k++) {
                    if (j % k == 0) {
                        count++;
                    }
                }
                for (int k = 1; k <= onesTop; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && count == 2) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }
}
