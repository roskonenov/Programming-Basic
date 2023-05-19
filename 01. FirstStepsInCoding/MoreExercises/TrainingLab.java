package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine()) * 100;
        double b = Double.parseDouble(scanner.nextLine()) * 100;
        double aRemainder = a % 120;
        double rows = (a - aRemainder) / 120;
        double bRemainder = (b - 100) % 70;
        double seatsAtRow = (b - 100 - bRemainder) / 70;
        double allSeats = rows * seatsAtRow - 3;
        System.out.printf("%.0f", allSeats);

    }
}
