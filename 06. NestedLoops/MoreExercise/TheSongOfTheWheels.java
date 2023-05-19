package NestedLoops.MoreExercise;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean fourthPassFound = false;
        String fourthPass = "";
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (m == i * j + k * l && i < j && k > l) {
                            counter++;
                            if (counter == 4) {
                                fourthPassFound = true;
                                fourthPass = String.format("%d%d%d%d ", i, j, k, l);
                            }
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
        if (fourthPassFound) {
            System.out.println();
            System.out.println("Password: " + fourthPass);
        } else {
            System.out.println();
            System.out.println("No!");
        }
    }
}
