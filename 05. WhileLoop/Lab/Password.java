package WhileLoop.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String text = scanner.nextLine();
        while (!text.equals(password)) {
            text = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);
    }
}
