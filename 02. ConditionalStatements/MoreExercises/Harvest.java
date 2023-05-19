package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double wineProduced = ((vineyardArea * grapesPerSquareMeter) * .4) / 2.5;
        if (wineProduced < wineNeeded) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeeded - wineProduced));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n" +
                            "%.0f liters left -> %.0f liters per person.",
                    Math.floor(wineProduced), Math.ceil(wineProduced - wineNeeded), Math.ceil((wineProduced - wineNeeded) / workers));
        }
    }
}
