package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double persent = Double.parseDouble(scanner.nextLine()) / 100;
        double vLitters = a * b * h * 0.001;
        double vFinal = vLitters - (vLitters * persent);
        System.out.println(vFinal);
    }
}
