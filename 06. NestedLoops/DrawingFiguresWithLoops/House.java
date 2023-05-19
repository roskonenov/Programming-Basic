package NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = ((n + 1) / 2) - 1; j >= i; j--) {
                System.out.print("-");
            }
            if (n % 2 == 0) {
                for (int j = 0; j < i * 2; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("*");
                }
            }
            for (int j = ((n + 1) / 2) - 1; j >= i; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("|");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

