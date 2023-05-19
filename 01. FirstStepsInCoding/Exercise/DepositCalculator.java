package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = Integer.parseInt(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        Double Interest = Double.parseDouble(scanner.nextLine());
        Double endSum = deposit + months * ((deposit * Interest / 100) / 12);
        System.out.println(endSum);
    }
}
