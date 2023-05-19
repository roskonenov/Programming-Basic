package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Първи ред – Сезон – текст "Spring", "Summer", "Autumn" или "Winter"
        String season = scanner.nextLine();
        double kilometersMonthly = Double.parseDouble(scanner.nextLine());
        double paycheck = 0.0;
        if (kilometersMonthly <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    paycheck = kilometersMonthly * .75 * 4;
                    break;
                case "Summer":
                    paycheck = kilometersMonthly * .9 * 4;
                    break;
                case "Winter":
                    paycheck = kilometersMonthly * 1.05 * 4;
                    break;
            }
        } else if (kilometersMonthly > 10000) {
            paycheck = kilometersMonthly * 1.45 * 4;
        } else {
            switch (season) {
                case "Spring":
                case "Autumn":
                    paycheck = kilometersMonthly * .95 * 4;
                    break;
                case "Summer":
                    paycheck = kilometersMonthly * 1.1 * 4;
                    break;
                case "Winter":
                    paycheck = kilometersMonthly * 1.25 * 4;
                    break;
            }
        }
        System.out.printf("%.2f", paycheck * .9);

    }
}
