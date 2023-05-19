package NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = (n - 1) / 2; j >= i; j--) {
                System.out.print("-");
            }
            System.out.print("*");
            if (n % 2 == 0) {
                for (int j = 2; j < i * 2; j++) {
                    System.out.print("-");
                }
            } else {
                for (int j = 2; j < i * 2 - 1; j++) {
                    System.out.print("-");
                }
            }
            if (n % 2 != 0 && i == 1) {
            } else {
                System.out.print("*");
            }
            for (int j = (n - 1) / 2; j >= i; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
        for (int i = (n - 1) / 2; i >= 1; i--) {
            for (int j = (n - 1) / 2; j >= i; j--) {
                System.out.print("-");
            }
            System.out.print("*");
            if (n % 2 == 0) {
                for (int j = 2; j < i * 2; j++) {
                    System.out.print("-");
                }
            } else {
                for (int j = 2; j < i * 2 - 1; j++) {
                    System.out.print("-");
                }
            }
            if (n % 2 != 0 && i == 1) {
            } else {
                System.out.print("*");
            }
            for (int j = (n - 1) / 2; j >= i; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
