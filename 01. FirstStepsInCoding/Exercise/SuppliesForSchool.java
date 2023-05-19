package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double priseMaterials = pens * 5.8 + markers * 7.2 + liters * 1.2;
        double finalPrice = priseMaterials - priseMaterials * discount / 100;
        System.out.println(finalPrice);

    }
}
