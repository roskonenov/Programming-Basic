package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double materialsPrise = ((Nylon + 2) * 1.5) + ((paint + paint * 0.1) * 14.5) + (thinner * 5) + 0.4;
        double masters = (materialsPrise * 0.3) * hours;
        System.out.println(materialsPrise + masters);

    }
}
