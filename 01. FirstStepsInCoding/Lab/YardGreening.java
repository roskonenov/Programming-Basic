package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double squareMeters = Double.parseDouble(scanner.nextLine());
        Double totalPrice = squareMeters * 7.61;
        Double discount = totalPrice * 0.18;
        Double finalPrice = totalPrice - discount;
        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discount);
    }
}
