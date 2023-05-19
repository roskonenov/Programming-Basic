package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double houseWalls = ((x * x * 2 - 1.2 * 2) + (x * y * 2 - 1.5 * 1.5 * 2)) / 3.4;
        double houseRoof = ((x * y * 2) + (x * h / 2) * 2) / 4.3;
        System.out.printf("%.2f%n%.2f", houseWalls, houseRoof);
    }
}

