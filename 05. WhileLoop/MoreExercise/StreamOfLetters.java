package WhileLoop.MoreExercise;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String input = scanner.nextLine();
        int cCount = 0;
        int oCount = 0;
        int nCount = 0;
        while (!input.equals("End")) {
            String letter = input;
            int ascii = letter.charAt(0);
            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
                if (cCount == 1 && oCount == 1 && nCount == 1) {
                    System.out.print(word + " ");
                    word = "";
                    oCount = 0;
                    cCount = 0;
                    nCount = 0;
                }
                if (letter.equals("c") && cCount == 0) {
                    cCount++;
                    input = scanner.nextLine();
                    continue;
                } else if (letter.equals("o") && oCount == 0) {
                    oCount++;
                    input = scanner.nextLine();
                    continue;
                } else if (letter.equals("n") && nCount == 0) {
                    nCount++;
                    input = scanner.nextLine();
                    continue;
                } else {
                    word += letter;
                }
            }
            input = scanner.nextLine();
        }
        if (cCount == 1 && oCount == 1 && nCount == 1) {
            System.out.print(word + " ");
        }
    }
}
