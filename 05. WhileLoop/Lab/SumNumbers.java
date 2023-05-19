package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        int numberSum = number;
        while (numberSum < n) {
            number = Integer.parseInt(scanner.nextLine());
            numberSum += number;
        }
        System.out.println(numberSum);
    }
}
