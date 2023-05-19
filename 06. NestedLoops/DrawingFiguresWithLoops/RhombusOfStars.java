package NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i > 1; i--) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
