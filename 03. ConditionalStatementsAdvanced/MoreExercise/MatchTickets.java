package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0.0;
        double transport = 0.0;
        switch (category) {
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
                break;
        }
        if (group <= 4) {
            transport = budget * .75;
        } else if (group <= 9) {
            transport = budget * .6;
        } else if (group <= 24) {
            transport = budget * .5;
        } else if (group <= 49) {
            transport = budget * .4;
        } else {
            transport = budget * .25;
        }
        double expenses = group * ticketPrice + transport;
        double diff = Math.abs(budget - expenses);
        if (budget >= expenses) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
