package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0.0;
        switch (projectionType) {
            case "Premiere":
                income = rows * columns * 12;
                break;
            case "Normal":
                income = rows * columns * 7.5;
                break;
            case "Discount":
                income = rows * columns * 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
