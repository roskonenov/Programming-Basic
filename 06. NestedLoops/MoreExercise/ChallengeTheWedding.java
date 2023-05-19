package NestedLoops.MoreExercise;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int male = Integer.parseInt(scanner.nextLine());
        int female = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= male; i++) {
            for (int j = 1; j <= female; j++) {
                maxTables--;
                if (maxTables >= 0) {
                    System.out.printf("(%d <-> %d) ", i, j);
                } else {
                    break;
                }
            }
            if (maxTables == 0) {
                break;
            }
        }
    }
}
