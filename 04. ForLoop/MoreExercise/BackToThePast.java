package ForLoop.MoreExercise;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        int n = yearToLive - 1800;
        int birthday = 18;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                inheritedMoney -= 12000;
                birthday++;
            } else {
                inheritedMoney -= 12000 + 50 * birthday;
                birthday++;
            }
        }
        if (inheritedMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }
    }
}
