package ForLoop.MoreExercise;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int topStudents = 0;
        int grade4Students = 0;
        int grade3Students = 0;
        int failStudents = 0;
        double gradeSum = 0;
        for (int i = 0; i < n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradeSum += grade;
            if (grade >= 5) {
                topStudents++;
            } else if (grade >= 4) {
                grade4Students++;
            } else if (grade >= 3) {
                grade3Students++;
            } else {
                failStudents++;
            }
        }
        double averageGrade = gradeSum / n;
        double percentTop = topStudents * 1.0 / n * 100;
        double percentGrade4 = grade4Students * 1.0 / n * 100;
        double percentGrade3 = grade3Students * 1.0 / n * 100;
        double percentFail = failStudents * 1.0 / n * 100;
        System.out.printf("Top students: %.2f%%\n", percentTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", percentGrade4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", percentGrade3);
        System.out.printf("Fail: %.2f%%\n", percentFail);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
