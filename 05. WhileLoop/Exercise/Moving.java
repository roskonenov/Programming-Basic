package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spaceWidth = Integer.parseInt(scanner.nextLine());
        int spaceLength = Integer.parseInt(scanner.nextLine());
        int spaceHeight = Integer.parseInt(scanner.nextLine());
        int freeSpace = spaceHeight * spaceLength * spaceWidth;
        String input = scanner.nextLine();
        boolean spaceIsEnough = true;
        while (!input.equals("Done")) {
            int boxesCount = Integer.parseInt(input);
            freeSpace -= boxesCount;
            if (freeSpace < 0) {
                spaceIsEnough = false;
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
                break;
            }
            input = scanner.nextLine();
        }
        if (spaceIsEnough) {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
