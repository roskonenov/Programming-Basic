package NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i == 1 || i == n || j == 1 || j == 2 * n) {
                    System.out.print("*");
                } else {
                    System.out.print("/");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i == n / 2 && n % 2 == 0 || i == (n / 2) + 1 && n % 2 != 0) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= 2 * n; j++) {
                if (i == 1 || i == n || j == 1 || j == 2 * n) {
                    System.out.print("*");
                } else {
                    System.out.print("/");
                }
            }
            System.out.println();
        }
    }
}
