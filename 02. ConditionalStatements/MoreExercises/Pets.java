package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine()) / 1000;
        double foodNeeded = dogFood * days + catFood * days + turtleFood * days;
        if (leftFood >= foodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFood - foodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeeded - leftFood));
        }
    }
}
