package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double price = 0;
        if (clubCard.equals("Yes")) {
            switch (fuel) {
                case "Gas":
                    price = quantity * .85;
                    break;
                case "Gasoline":
                    price = quantity * 2.04;
                    break;
                case "Diesel":
                    price = quantity * 2.21;
                    break;
            }
        } else {
            switch (fuel) {
                case "Gas":
                    price = quantity * .93;
                    break;
                case "Gasoline":
                    price = quantity * 2.22;
                    break;
                case "Diesel":
                    price = quantity * 2.33;
                    break;
            }
        }
        if (quantity > 25) {
            System.out.printf("%.2f lv.", price - price * .1);
        } else if (quantity < 20) {
            System.out.printf("%.2f lv.", price);
        } else {
            System.out.printf("%.2f lv.", price - price * .08);
        }

    }


}
