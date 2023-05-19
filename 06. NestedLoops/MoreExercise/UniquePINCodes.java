package NestedLoops.MoreExercise;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                int count = 0;
                for (int k = 1; k <= j; k++) {
                    if (j % k == 0) {
                        count++;
                    }
                }
                for (int k = 1; k <= third; k++) {
                    if (i % 2 == 0 && count == 2 && k % 2 == 0) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }
}
