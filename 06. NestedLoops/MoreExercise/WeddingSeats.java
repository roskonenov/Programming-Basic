package NestedLoops.MoreExercise;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastSector = scanner.nextLine();
        int rowsFirstSector = Integer.parseInt(scanner.nextLine());
        int seatsOddRow = Integer.parseInt(scanner.nextLine());
        int asciiSector = lastSector.charAt(0);
        int seatsCounter = 0;
        for (int i = 65; i <= asciiSector; i++) {
            String sector = Character.toString((char)i);

            for (int j = 1; j <= rowsFirstSector; j++) {
                for (int k = 97; k < seatsOddRow + 97; k++) {
                    String seat = Character.toString((char) k);
                    seatsCounter++;
                    System.out.printf("%s%d%s\n", sector, j, seat);
                }
                if (j % 2 != 0 && j != rowsFirstSector) {
                    seatsOddRow += 2;
                } else if (j % 2 == 0) {
                    seatsOddRow -= 2;
                }
            }
            rowsFirstSector++;
        }
        System.out.print(seatsCounter);
    }
}
