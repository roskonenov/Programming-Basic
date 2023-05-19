package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsCount = 0;
        boolean goalReached = true;
        while (stepsCount < 10000) {
            String input = scanner.nextLine();
            if (!input.equals("Going home")) {
                int steps = Integer.parseInt(input);
                stepsCount += steps;
            } else {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                stepsCount += stepsToHome;
                if (stepsCount < 10000) {
                    goalReached = false;
                    System.out.printf("%d more steps to reach goal.", 10000 - stepsCount);
                    break;
                } else {
                    break;
                }
            }
        }
        if (goalReached) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", stepsCount - 10000);
        }
    }
}
