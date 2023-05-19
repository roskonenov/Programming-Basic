package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());
        int examMinutesOnly = examHour * 60 + examMinute;
        int arrivalMinutesOnly = arrivalHour * 60 + arrivalMinute;
        if (arrivalMinutesOnly > examMinutesOnly) {
            System.out.println("Late");
            if ((arrivalMinutesOnly - examMinutesOnly) < 60) {
                System.out.printf("%d minutes after the start", arrivalMinutesOnly - examMinutesOnly);
            } else {
                System.out.printf("%d:%02d hours after the start", (arrivalMinutesOnly - examMinutesOnly) / 60, (arrivalMinutesOnly - examMinutesOnly) % 60);
            }
        } else {
            if ((examMinutesOnly - arrivalMinutesOnly) <= 30) {
                System.out.println("On time");
                if ((examMinutesOnly - arrivalMinutesOnly) != 0) {
                    System.out.printf("%d minutes before the start", examMinutesOnly - arrivalMinutesOnly);
                }
            } else {
                System.out.println("Early");
                if ((examMinutesOnly - arrivalMinutesOnly) < 60) {
                    System.out.printf("%d minutes before the start", examMinutesOnly - arrivalMinutesOnly);
                } else {
                    System.out.printf("%d:%02d hours before the start", (examMinutesOnly - arrivalMinutesOnly) / 60, (examMinutesOnly - arrivalMinutesOnly) % 60);
                }
            }
        }

    }
}
