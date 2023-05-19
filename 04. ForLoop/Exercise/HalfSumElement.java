package ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNumber) {
                maxNumber = num;
            }
            sum += num;
        }
        if (sum / maxNumber == 2) {
            System.out.printf("Yes\nSum = %d", maxNumber);
        } else {
            System.out.printf("No\nDiff = %.0f", Math.abs(sum - maxNumber * 2));
        }
    }
}
