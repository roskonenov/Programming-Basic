package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double costume = Double.parseDouble(scanner.nextLine());
        double decor = budget * .1;
        if (extras > 150) {
            costume = costume - costume * .1;
        }
        if (budget < (extras * costume + decor)) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", Math.abs(budget - (extras * costume + decor)));
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", Math.abs(budget - (extras * costume + decor)));
        }
    }
}
