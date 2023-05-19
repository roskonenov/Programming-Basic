package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine().toLowerCase();
        double litters = Double.parseDouble(scanner.nextLine());
        switch (fuel) {
            case "diesel":
            case "gasoline":
            case "gas":
                if (litters >= 25) {
                    System.out.printf("You have enough %s.", fuel);
                    break;
                } else {
                    System.out.printf("Fill your tank with %s!", fuel);
                    break;
                }
            default:
                System.out.println("Invalid fuel!");
        }

    }
}
