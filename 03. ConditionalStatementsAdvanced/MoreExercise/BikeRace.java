package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double fund = 0.0;
        switch (trace) {
            case "trail":
                fund = juniors * 5.5 + seniors * 7;
                break;
            case "cross-country":
                fund = juniors * 8 + seniors * 9.5;
                if ((juniors + seniors) >= 50) {
                    fund = fund * .75;
                }
                break;
            case "downhill":
                fund = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                fund = juniors * 20 + seniors * 21.5;
                break;
        }
        double charity = fund * .95;
        System.out.printf("%.2f", charity);
    }
}
