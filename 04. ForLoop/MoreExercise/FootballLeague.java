package ForLoop.MoreExercise;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int allFans = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        int v = 0;
        int g = 0;
        for (int i = 0; i < allFans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
            }
        }
        double percentA = a * 1.0 / allFans * 100;
        double percentB = b * 1.0 / allFans * 100;
        double percentV = v * 1.0 / allFans * 100;
        double percentG = g * 1.0 / allFans * 100;
        double percentAll = allFans * 1.0 / stadiumCapacity * 100;
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", percentA, percentB, percentV, percentG, percentAll);
    }
}
