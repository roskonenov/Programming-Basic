package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double budgetNeeded = Double.parseDouble(scanner.nextLine());
            while (budgetNeeded > 0) {
                double sumSaved = Double.parseDouble(scanner.nextLine());
                budgetNeeded -= sumSaved;
            }
            System.out.printf("Going to %s!\n", destination);
            destination = scanner.nextLine();
        }
    }
}
