package ConditionalStatements.Exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int sumMinutes = hours * 60 + minutes + 15;
        int newHours = sumMinutes / 60;
        int newMinutes = sumMinutes % 60;
        if (newHours == 24) {
            System.out.printf("0:%02d", newMinutes);
        } else {
            System.out.printf("%d:%02d", newHours, newMinutes);
        }
    }
}
