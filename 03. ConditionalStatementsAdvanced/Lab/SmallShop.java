package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        switch (product) {
            case "coffee":
                if (city.equals("Sofia")) {
                    price = quantity * .5;
                } else if (city.equals("Plovdiv")) {
                    price = quantity * .4;
                } else {
                    price = quantity * .45;
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    price = quantity * .8;
                } else if (city.equals("Plovdiv")) {
                    price = quantity * .7;
                } else {
                    price = quantity * .7;
                }
                break;
            case "beer":
                if (city.equals("Sofia")) {
                    price = quantity * 1.2;
                } else if (city.equals("Plovdiv")) {
                    price = quantity * 1.15;
                } else {
                    price = quantity * 1.1;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    price = quantity * 1.45;
                } else if (city.equals("Plovdiv")) {
                    price = quantity * 1.3;
                } else {
                    price = quantity * 1.35;
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")) {
                    price = quantity * 1.6;
                } else if (city.equals("Plovdiv")) {
                    price = quantity * 1.5;
                } else {
                    price = quantity * 1.55;
                }
                break;
        }
        System.out.printf("%f", price);
    }
}
