package ForLoop.MoreExercise;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double electricity = 0;
        double water = 0;
        double internet = 0;
        double other = 0;

        for (int i = 0; i < n; i++) {
            double electricityMonthly = Double.parseDouble(scanner.nextLine());
            electricity += electricityMonthly;
            water += 20;
            internet += 15;
            other += (electricityMonthly + 20 + 15) * 1.2;
        }
        double average = (electricity + water + internet + other) / n;
        System.out.printf("Electricity: %.2f lv\n", electricity);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", internet);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv", average);
    }
}
