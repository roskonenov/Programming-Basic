package ForLoop.MoreExercise;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double price = 0;
        int tonsSum = 0;
        int vanTons = 0;
        int truckTons = 0;
        int trainTons = 0;
        for (int i = 0; i < n; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            tonsSum += tons;
            if (tons <= 3) {
                price += tons * 200;
                vanTons += tons;
            } else if (tons >= 12) {
                price += tons * 120;
                trainTons += tons;
            } else {
                price += tons * 175;
                truckTons += tons;
            }
        }
        double averagePrice = price / tonsSum;
        double vanPercent = vanTons * 1.0 / tonsSum * 100;
        double truckPercent = truckTons * 1.0 / tonsSum * 100;
        double trainPercent = trainTons * 1.0 / tonsSum * 100;
        System.out.printf("%.2f\n%.2f%%\n%.2f%%\n%.2f%%", averagePrice, vanPercent, truckPercent, trainPercent);

    }
}
