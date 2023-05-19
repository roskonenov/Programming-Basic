package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int ranklistPoints = Integer.parseInt(scanner.nextLine());
        int championshipPoints = 0;
        int winsCount = 0;
        for (int i = 0; i < n; i++) {
            String win = scanner.nextLine();
            switch (win) {
                case "W":
                    championshipPoints += 2000;
                    winsCount++;
                    break;
                case "F":
                    championshipPoints += 1200;
                    break;
                case "SF":
                    championshipPoints += 720;
                    break;
            }
        }
        int finalPoints = ranklistPoints + championshipPoints;
        double averagePoints = Math.floor(championshipPoints * 1.0 / n);
        double winsPercent = winsCount * 1.0 / n * 100;
        System.out.printf("Final points: %d\n", finalPoints);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.2f%%", winsPercent);
    }
}
