package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String type = "";
        double prise = 0.0;
        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                    type = "Cabrio";
                    prise = budget * .35;
                    break;
                case "Winter":
                    type = "Jeep";
                    prise = budget * .65;
                    break;
            }
        } else if (budget > 500) {
            carClass = "Luxury class";
            type = "Jeep";
            prise = budget * .9;
        } else {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    type = "Cabrio";
                    prise = budget * .45;
                    break;
                case "Winter":
                    type = "Jeep";
                    prise = budget * .8;
                    break;
            }
        }
        System.out.printf("%s\n%s - %.2f", carClass, type, prise);
    }
}
