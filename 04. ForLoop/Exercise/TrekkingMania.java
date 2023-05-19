package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalCount += peopleInGroup;
            if (peopleInGroup <= 5) {
                musala += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblan += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimanjaro += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2 += peopleInGroup;
            } else {
                everest += peopleInGroup;
            }
        }
        double musalaPercent = musala * 1.0 / totalCount * 100;
        double monblanPercent = monblan * 1.0 / totalCount * 100;
        double kilimanjaroPercent = kilimanjaro * 1.0 / totalCount * 100;
        double k2Percent = k2 * 1.0 / totalCount * 100;
        double everestPercent = everest * 1.0 / totalCount * 100;
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", musalaPercent, monblanPercent, kilimanjaroPercent, k2Percent, everestPercent);
    }
}
