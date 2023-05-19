package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nonWorkingDays = Integer.parseInt(scanner.nextLine());
        int workingDays = 365 - nonWorkingDays;
        int playTime = nonWorkingDays * 127 + workingDays * 63;
        int difference = Math.abs(30000 - playTime);
        if (playTime <= 30000) {
            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play", difference / 60, difference % 60);
        } else {
            System.out.printf("Tom will run away\n%d hours and %d minutes more for play", difference / 60, difference % 60);
        }
    }
}
