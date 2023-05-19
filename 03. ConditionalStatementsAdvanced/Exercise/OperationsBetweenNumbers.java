package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double answer = 0.0;
        String evenOrOdd = "";
        switch (operator) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = num1 * 1.0 / num2;
                break;
            case "%":
                answer = num1 * 1.0 % num2;
                break;
        }
        if (answer % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }
        if ("+".equals(operator) || "-".equals(operator) || "*".equals(operator)) {
            System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, answer, evenOrOdd);
        } else if ("/".equals(operator)) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                System.out.printf("%d / %d = %.2f", num1, num2, answer);
            }
        } else {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                System.out.printf("%d %c %d = %.0f", num1, '%', num2, answer);
            }
        }
    }
}
