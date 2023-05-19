package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * .05;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * .07;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * .08;
                } else if (sales > 10000) {
                    commission = sales * .12;
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * .045;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * .075;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * .1;
                } else if (sales > 10000) {
                    commission = sales * .13;
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * .055;
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * .08;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * .12;
                } else if (sales > 10000) {
                    commission = sales * .145;
                } else {
                    System.out.println("error");
                }
                break;

            default:
                System.out.println("error");
                break;
        }
        if (commission > 0) {
            System.out.printf("%.2f", commission);
        }
    }
}
