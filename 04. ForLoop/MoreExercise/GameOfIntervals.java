package ForLoop.MoreExercise;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double finalResult = 0;
        int zeroTo10 = 0;
        int tenTo20 = 0;
        int twentyTo30 = 0;
        int thirtyTo40 = 0;
        int fortyTo50 = 0;
        int invalidNumbers = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0 && number < 10) {
                finalResult += number * .2;
                zeroTo10++;
            } else if (number < 20 && number > 0) {
                finalResult += number * .3;
                tenTo20++;
            } else if (number < 30 && number > 0) {
                finalResult += number * .4;
                twentyTo30++;
            } else if (number < 40 && number > 0) {
                finalResult += 50;
                thirtyTo40++;
            } else if (number <= 50 && number > 0) {
                finalResult += 100;
                fortyTo50++;
            } else {
                finalResult /= 2;
                invalidNumbers++;
            }

        }
        double zeroTo10Percent = zeroTo10 * 1.0 / n * 100;
        double tenTo20Percent = tenTo20 * 1.0 / n * 100;
        double twentyTo30Percent = twentyTo30 * 1.0 / n * 100;
        double thirtyTo40Percent = thirtyTo40 * 1.0 / n * 100;
        double fortyTo50Percent = fortyTo50 * 1.0 / n * 100;
        double invalidNumPercent = invalidNumbers * 1.0 / n * 100;
        System.out.printf("%.2f\n", finalResult);
        System.out.printf("From 0 to 9: %.2f%%\n", zeroTo10Percent);
        System.out.printf("From 10 to 19: %.2f%%\n", tenTo20Percent);
        System.out.printf("From 20 to 29: %.2f%%\n", twentyTo30Percent);
        System.out.printf("From 30 to 39: %.2f%%\n", thirtyTo40Percent);
        System.out.printf("From 40 to 50: %.2f%%\n", fortyTo50Percent);
        System.out.printf("Invalid numbers: %.2f%%", invalidNumPercent);
    }
}
