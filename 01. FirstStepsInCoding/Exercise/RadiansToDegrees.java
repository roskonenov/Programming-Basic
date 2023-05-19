package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double rad = Double.parseDouble(scanner.nextLine());
        Double grad = rad * 180 / Math.PI;
        System.out.println(grad);
    }


}
