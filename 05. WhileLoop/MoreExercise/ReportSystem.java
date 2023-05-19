package WhileLoop.MoreExercise;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int charitySumNeeded = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int cycleCount = 0;
        int cashCount = 0;
        int cashSum = 0;
        int cardCount = 0;
        int cardSum = 0;
        boolean charityRaised = false;
        while (!input.equals("End")) {
            int currentAmount = Integer.parseInt(input);
            cycleCount++;
            if (cycleCount % 2 != 0) {
                if (currentAmount <= 100) {
                    charitySumNeeded -= currentAmount;
                    cashSum += currentAmount;
                    System.out.println("Product sold!");
                    cashCount++;
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (currentAmount < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    charitySumNeeded -= currentAmount;
                    cardSum += currentAmount;
                    System.out.println("Product sold!");
                    cardCount++;
                }
            }
            if (charitySumNeeded <= 0) {
                System.out.printf("Average CS: %.2f\n", cashSum * 1.0 / cashCount);
                System.out.printf("Average CC: %.2f", cardSum * 1.0 / cardCount);
                charityRaised = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!charityRaised) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
