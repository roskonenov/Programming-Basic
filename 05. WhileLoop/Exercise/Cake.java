package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());
        int cakeArea = cakeLength * cakeWidth;
        String input = scanner.nextLine();
        boolean cakeIsEnough = true;
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            cakeArea -= pieces;
            if (cakeArea < 0) {
                cakeIsEnough = false;
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeArea));
                break;
            }
            input = scanner.nextLine();
        }
        if (cakeIsEnough) {
            System.out.printf("%d pieces are left.", cakeArea);
        }
    }
}
