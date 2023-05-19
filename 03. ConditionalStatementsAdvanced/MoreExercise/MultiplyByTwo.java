package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            while (number >= 0) {
                System.out.printf("Result: %.2f\n", number * 2);
                break;
            }
            if (number < 0) {
                System.out.println("Negative number!");
                break;
            }
        }


    }
}
