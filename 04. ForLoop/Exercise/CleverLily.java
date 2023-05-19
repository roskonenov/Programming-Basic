package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
        double birthdayMoney = 0;
        double moneyCount = 0;
        int toyCount = 0;
        double brotherMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                brotherMoney++;
                birthdayMoney += 10;
                moneyCount += birthdayMoney;
            } else {
                toyCount++;
            }
        }
        moneyCount = moneyCount - brotherMoney + toyCount * toyPrice;
        if (moneyCount >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", moneyCount - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - moneyCount);
        }
    }
}
