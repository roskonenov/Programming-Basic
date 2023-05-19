package NestedLoops.MoreExercise;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean combinationFound = false;
        for (int i = beginning; i <= end; i++) {
            for (int j = beginning; j <= end; j++) {
                if (i + j == magicNumber) {
                    counter++;
                    combinationFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    break;
                } else {
                    counter++;
                }
            }
            if (combinationFound) {
                break;
            }
        }
        if (!combinationFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
