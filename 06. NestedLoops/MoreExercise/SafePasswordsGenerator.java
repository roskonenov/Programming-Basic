package NestedLoops.MoreExercise;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int firstSymbol = 35;
        int secondSymbol = 64;
        int passCount = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                String firstLetter = Character.toString((char) firstSymbol);
                String secondLetter = Character.toString((char) secondSymbol);
                firstSymbol++;
                secondSymbol++;
                System.out.printf("%s%s%d%d%s%s|", firstLetter, secondLetter, i, j, secondLetter, firstLetter);
                passCount++;
                if (passCount == maxPasswords) {
                    break;
                }
                if (firstSymbol > 55) {
                    firstSymbol = 35;
                }
                if (secondSymbol > 96) {
                    secondSymbol = 64;
                }
            }
            if (passCount == maxPasswords) {
                break;
            }
        }
    }
}
