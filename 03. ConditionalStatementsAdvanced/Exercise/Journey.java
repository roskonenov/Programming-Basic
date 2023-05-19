package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String holiday = "";
        double moneySpent = 0.0;
        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    holiday = "Camp";
                    moneySpent = budget * .3;
                    break;
                case "winter":
                    holiday = "Hotel";
                    moneySpent = budget * .7;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    holiday = "Camp";
                    moneySpent = budget * .4;
                    break;
                case "winter":
                    holiday = "Hotel";
                    moneySpent = budget * .8;
                    break;
            }
        } else {
            destination = "Europe";
            holiday = "Hotel";
            moneySpent = budget * .9;
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", destination, holiday, moneySpent);
    }
}
