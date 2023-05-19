package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax = Integer.parseInt(scanner.nextLine());
        Double sneakers = yearTax - yearTax * 0.4;
        Double outfit = sneakers - sneakers * 0.2;
        Double ball = outfit / 4;
        Double accessories = ball / 5;
        System.out.println(yearTax + sneakers + outfit + ball + accessories);
    }
}
