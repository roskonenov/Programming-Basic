package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String assessment = scanner.nextLine();
        int overnightStay = daysStay - 1;
        double price = 0.0;
        switch (typeOfRoom) {
            case "room for one person":
                price = overnightStay * 18;
                break;
            case "apartment":
                price = overnightStay * 25;
                if (daysStay < 10) {
                    price = price * .7;
                } else if (daysStay > 15) {
                    price = price * .5;
                } else {
                    price = price * .65;
                }
                break;
            case "president apartment":
                price = overnightStay * 35;
                if (daysStay < 10) {
                    price = price * .9;
                } else if (daysStay > 15) {
                    price = price * .8;
                } else {
                    price = price * .85;
                }
                break;
        }
        if ("positive".equals(assessment)) {
            price = price * 1.25;
        } else {
            price = price * .9;
        }
        System.out.printf("%.2f", price);
    }
}
