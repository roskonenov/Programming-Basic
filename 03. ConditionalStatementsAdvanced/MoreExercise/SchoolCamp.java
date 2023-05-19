package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int overnightStay = Integer.parseInt(scanner.nextLine());
        String sport = "";
        double prise = 0.0;
        switch (season) {
            case "Winter":
                if ("boys".equals(groupType)) {
                    sport = "Judo";
                    prise = overnightStay * studentsCount * 9.6;
                } else if ("girls".equals(groupType)) {
                    sport = "Gymnastics";
                    prise = overnightStay * studentsCount * 9.6;
                } else {
                    sport = "Ski";
                    prise = overnightStay * studentsCount * 10;
                }
                break;
            case "Spring":
                if ("boys".equals(groupType)) {
                    sport = "Tennis";
                    prise = overnightStay * studentsCount * 7.2;
                } else if ("girls".equals(groupType)) {
                    sport = "Athletics";
                    prise = overnightStay * studentsCount * 7.2;
                } else {
                    sport = "Cycling";
                    prise = overnightStay * studentsCount * 9.5;
                }
                break;
            case "Summer":
                if ("boys".equals(groupType)) {
                    sport = "Football";
                    prise = overnightStay * studentsCount * 15;
                } else if ("girls".equals(groupType)) {
                    sport = "Volleyball";
                    prise = overnightStay * studentsCount * 15;
                } else {
                    sport = "Swimming";
                    prise = overnightStay * studentsCount * 20;
                }
                break;

        }
        if (studentsCount >= 50) {
            prise = prise * .5;
        } else if (studentsCount >= 20) {
            prise = prise * .85;
        } else if (studentsCount >= 10) {
            prise = prise * .95;
        }
        System.out.printf("%s %.2f lv.", sport, prise);

    }
}
