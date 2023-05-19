package NestedLoops.MoreExercise;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                for (int k = firstNumber; k <= secondNumber; k++) {
                    for (int l = firstNumber; l <= secondNumber; l++) {
                        if (i % 2 == 0 && l % 2 != 0 && i > l && (j + k) % 2 == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        } else if ((i % 2 != 0 && l % 2 == 0 && i > l && (j + k) % 2 == 0)) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
