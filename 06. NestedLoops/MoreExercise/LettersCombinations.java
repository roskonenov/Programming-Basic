package NestedLoops.MoreExercise;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLetter = scanner.nextLine();
        String secondLetter = scanner.nextLine();
        String exceptionLetter = scanner.nextLine();
        int exception = exceptionLetter.charAt(0);
        int counter = 0;
        for (int i = firstLetter.charAt(0); i <= secondLetter.charAt(0); i++) {
            for (int j = firstLetter.charAt(0); j <= secondLetter.charAt(0); j++) {
                for (int k = firstLetter.charAt(0); k <= secondLetter.charAt(0); k++) {
                    if (i != exception && j != exception && k != exception) {
                        counter++;
                        String letterA = Character.toString(i);
                        String letterB = Character.toString(j);
                        String letterC = Character.toString(k);
                        System.out.printf("%s%s%s ", letterA, letterB, letterC);
                    }
                }
            }
        }
        System.out.print(counter);
    }
}
