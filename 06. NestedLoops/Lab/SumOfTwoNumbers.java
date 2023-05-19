package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int num1 = 0;
        int num2 = 0;
        boolean combinationFound = false;
        for (int i = x1; i <= x2; i++) {
            for (int j = x1; j <= x2; j++) {
                counter++;
                if (i + j == magicNumber) {
                    num1 = i;
                    num2 = j;
                    combinationFound = true;
                    break;
                }
            }
            if (combinationFound) {
                break;
            }
        }
        if (combinationFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, num1, num2, magicNumber);

        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
