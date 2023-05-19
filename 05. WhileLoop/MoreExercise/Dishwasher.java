package WhileLoop.MoreExercise;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottlesDetergent = Integer.parseInt(scanner.nextLine());
        int detergent = 750 * bottlesDetergent;
        int dishesCount = 0;
        int potCount = 0;
        int cycleCount = 0;
        boolean detergentIsEnough = true;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            cycleCount++;
            int dishesPotCount = Integer.parseInt(input);
            if (cycleCount % 3 != 0) {
                dishesCount += dishesPotCount;
                detergent -= (dishesPotCount * 5);
            } else {
                potCount += dishesPotCount;
                detergent -= (dishesPotCount * 15);
            }
            if (detergent < 0) {
                detergentIsEnough = false;
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
                break;
            }
            input = scanner.nextLine();
        }
        if (detergentIsEnough) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", dishesCount, potCount);
            System.out.printf("Leftover detergent %d ml.", detergent);
        }
    }
}
