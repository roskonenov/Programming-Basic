package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double sprinklePrice = Double.parseDouble(scanner.nextLine());
        double bonitoWeight = Double.parseDouble(scanner.nextLine());
        double safridWeight = Double.parseDouble(scanner.nextLine());
        double clamWeight = Double.parseDouble(scanner.nextLine());
        double bonitoPrice = mackerelPrice + mackerelPrice * 0.6;
        double safridprice = sprinklePrice + sprinklePrice * 0.8;
        double check = bonitoPrice * bonitoWeight + safridprice * safridWeight + clamWeight * 7.5;
        System.out.printf("%.2f", check);
    }
}
