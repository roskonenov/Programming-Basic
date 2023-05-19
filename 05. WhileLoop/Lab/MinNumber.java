package WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;
        while (!n.equals("Stop")) {
            int number = Integer.parseInt(n);
            if (number < minNumber) {
                minNumber = number;
            }
            n = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
