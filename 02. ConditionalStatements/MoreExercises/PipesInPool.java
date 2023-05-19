package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poolVolume = Integer.parseInt(scanner.nextLine());
        int pipe1Debit = Integer.parseInt(scanner.nextLine());
        int pipe2Debit = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        double waterQuantity = (pipe1Debit + pipe2Debit) * hours;
        if (poolVolume >= waterQuantity) {
            double percentFiledPool = (waterQuantity * 100) / poolVolume;
            double percentPipe1 = ((pipe1Debit * hours) * 100) / waterQuantity;
            double percentPipe2 = ((pipe2Debit * hours) * 100) / waterQuantity;
            System.out.printf("The pool is %.2f%c  full. Pipe 1: %.2f%c. Pipe 2: %.2f%c.", percentFiledPool, '%', percentPipe1, '%', percentPipe2, '%');
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, waterQuantity - poolVolume);
        }
    }
}
