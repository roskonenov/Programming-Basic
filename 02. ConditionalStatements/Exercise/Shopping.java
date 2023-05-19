package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double sumNeeded = videoCards * 250 + (videoCards * 250 * .35) * processors + (videoCards * 250 * .1) * ram;
        if (videoCards > processors) {
            sumNeeded = sumNeeded - sumNeeded * .15;
        }
        if (sumNeeded <= budget) {
            System.out.printf("You have %.2f leva left!", Math.abs(sumNeeded - budget));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(sumNeeded - budget));
        }
    }
}
