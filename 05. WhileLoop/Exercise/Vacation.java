package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionMoney = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        int spendDayCount = 0;
        int daysCount = 0;
        boolean canSaveMoney = true;
        while (moneyOnHand < excursionMoney) {
            String spendSave = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            daysCount++;
            switch (spendSave) {
                case "spend":
                    spendDayCount++;
                    moneyOnHand -= sum;
                    if (moneyOnHand < 0) {
                        moneyOnHand = 0;
                    }
                    break;
                case "save":
                    spendDayCount = 0;
                    moneyOnHand += sum;
                    break;
            }
            if (spendDayCount == 5) {
                canSaveMoney = false;
                System.out.println("You can't save the money.");
                System.out.printf("%d", daysCount);
                break;
            }
        }
        if (canSaveMoney) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }

    }
}
