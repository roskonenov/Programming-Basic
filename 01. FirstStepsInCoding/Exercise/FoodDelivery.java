package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());
        double order = chicken * 10.35 + fish * 12.4 + vegetarian * 8.15;
        double finalPrice = order + order * 0.2 + 2.5;
        System.out.println(finalPrice);

    }
}
