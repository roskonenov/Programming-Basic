package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();
        double taxiTariff = 0;
        if (dayNight.equals("day")) {
            taxiTariff = .7 + kilometers * .79;
        } else {
            taxiTariff = .7 + kilometers * .9;
        }
        if (kilometers < 20) {
            System.out.printf("%.2f", taxiTariff);
        } else if (kilometers >= 100) {
            System.out.printf("%.2f", kilometers * .06);
        } else System.out.printf("%.2f", kilometers * .09);
    }
}
