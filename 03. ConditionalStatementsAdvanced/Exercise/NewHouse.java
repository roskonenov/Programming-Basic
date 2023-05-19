package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (flowers) {
            case "Roses":
                price = flowerCount * 5;
                if (flowerCount > 80) {
                    price = price * .9;
                }
                break;
            case "Dahlias":
                price = flowerCount * 3.8;
                if (flowerCount > 90) {
                    price = price * .85;
                }
                break;
            case "Tulips":
                price = flowerCount * 2.8;
                if (flowerCount > 80) {
                    price = price * .85;
                }
                break;
            case "Narcissus":
                price = flowerCount * 3;
                if (flowerCount < 120) {
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = flowerCount * 2.5;
                if (flowerCount < 80) {
                    price = price * 1.2;
                }
                break;

        }
        double diff = Math.abs(budget - price);
        boolean isEnough = budget >= price;
        if (isEnough == true) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowers, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
