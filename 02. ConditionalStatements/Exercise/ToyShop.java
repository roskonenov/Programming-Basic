package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzels = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double orderSum = puzzels * 2.6 + dolls * 3 + teddyBears * 4.1 + minions * 8.2 + trucks * 2;
        if ((puzzels + dolls + teddyBears + minions + trucks) >= 50) {
            orderSum = orderSum - orderSum * .25;
        }
        double finalSum = orderSum - orderSum * .1;
        if (holidayPrice <= finalSum) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(holidayPrice - finalSum));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(holidayPrice - finalSum));
        }
    }
}
