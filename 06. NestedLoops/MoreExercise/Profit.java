package NestedLoops.MoreExercise;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneLevs = Integer.parseInt(scanner.nextLine());
        int twoLevs = Integer.parseInt(scanner.nextLine());
        int fiveLevs = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= oneLevs; i++) {
            for (int j = 0; j <= twoLevs; j++) {
                for (int k = 0; k <= fiveLevs; k++) {
                    if (i + (j * 2) + (k * 5) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
