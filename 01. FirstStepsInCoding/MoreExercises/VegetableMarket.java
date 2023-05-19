package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegetableWeight = Integer.parseInt(scanner.nextLine());
        int fruitsWeight = Integer.parseInt(scanner.nextLine());
        double incomes = (vegetablePrice * vegetableWeight + fruitsWeight * fruitsPrice) / 1.94;
        System.out.printf("%.2f", incomes);
    }
}
