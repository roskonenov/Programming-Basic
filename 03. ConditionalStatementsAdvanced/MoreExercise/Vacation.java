package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String place = "";
        double prise = 0.0;
        if ("Summer".equals(season)) {
            location = "Alaska";
        } else {
            location = "Morocco";
        }
        if (budget <= 1000) {
            place = "Camp";
            if ("Summer".equals(season)) {
                prise = budget * .65;
            } else {
                prise = budget * .45;
            }


        } else if (budget > 3000) {
            place = "Hotel";
            prise = budget * .9;
        } else {
            place = "Hut";
            if ("Summer".equals(season)) {
                prise = budget * .8;
            } else {
                prise = budget * .6;
            }
        }
        System.out.printf("%s - %s - %.2f", location, place, prise);
    }
}
