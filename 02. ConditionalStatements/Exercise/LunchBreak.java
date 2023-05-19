package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String showName = scanner.nextLine();
        double epizodeTime = Double.parseDouble(scanner.nextLine());
        double breakTime = Double.parseDouble(scanner.nextLine());
        double timeNeeded = breakTime - breakTime / 8 - breakTime / 4;
        if (timeNeeded >= epizodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", showName, Math.ceil(timeNeeded - epizodeTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", showName, Math.ceil(epizodeTime - timeNeeded));
        }
    }
}
