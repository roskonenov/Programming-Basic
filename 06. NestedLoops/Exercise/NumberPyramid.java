package NestedLoops.Exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        boolean ready = false;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", num);
                num++;
                if (num > n) {
                    ready = true;
                    break;
                }
            }if (ready) {
                break;
            }
            System.out.println();
        }


    }
}
