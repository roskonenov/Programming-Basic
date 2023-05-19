package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int classCounter = 0;
        int badGradeCount = 0;
        double gradeSum = 0;
        while (classCounter < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            ;
            if (grade >= 4) {
                gradeSum += grade;
                classCounter++;
                badGradeCount = 0;
            } else {
                badGradeCount++;
            }
            if (badGradeCount == 2) {
                System.out.printf("%s has been excluded at %d grade", name, ++classCounter);
                break;
            }
        }
        if (classCounter == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, gradeSum / classCounter);
        }

    }
}
