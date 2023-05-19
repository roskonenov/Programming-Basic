package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double bouquetPrise = 0.0;
        switch (season) {
            case "Spring":
            case "Summer":
                bouquetPrise = chrysanthemums * 2.00 + roses * 4.1 + tulips * 2.5;
                break;
            case "Autumn":
            case "Winter":
                bouquetPrise = chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15;
                break;
        }
        if ("Y".equals(holiday)) {
            bouquetPrise = bouquetPrise * 1.15;
        }
        if (tulips > 7 && "Spring".equals(season)) {
            bouquetPrise = bouquetPrise * .95;
        }
        if (roses >= 10 && "Winter".equals(season)) {
            bouquetPrise = bouquetPrise * .9;
        }
        if ((chrysanthemums + roses + tulips) > 20) {
            bouquetPrise = bouquetPrise * .8;
        }
        double finalPrise = bouquetPrise + 2;
        System.out.printf("%.2f", finalPrise);
    }
}
