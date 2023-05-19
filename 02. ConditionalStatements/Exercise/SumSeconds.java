package ConditionalStatements.Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondsFirst = Integer.parseInt(scanner.nextLine());
        int secondsSecond = Integer.parseInt(scanner.nextLine());
        int secondsThitd = Integer.parseInt(scanner.nextLine());
        int secondsAll = secondsFirst + secondsSecond + secondsThitd;
        int minutes = secondsAll / 60;
        int remaindSeconds = secondsAll % 60;
        if (remaindSeconds < 10) {
            System.out.printf("%d:0%d", minutes, remaindSeconds);
        } else {
            System.out.printf("%d:%d", minutes, remaindSeconds);
        }
    }
}
