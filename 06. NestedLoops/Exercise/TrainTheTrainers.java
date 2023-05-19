package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double totalGradeSum = 0;
        int presentationCounter = 0;
        while (!presentationName.equals("Finish")) {
            presentationCounter++;
            double gradesSum = 0;
            double averageGrade = 0;
            for (int i = 1; i <= jury; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                gradesSum += grades;
            }
            averageGrade = gradesSum / jury;
            System.out.printf("%s - %.2f.\n", presentationName, averageGrade);
            totalGradeSum += averageGrade;
            presentationName = scanner.nextLine();
        }
        double totalAverageGrade = totalGradeSum / presentationCounter;
        System.out.printf("Student's final assessment is %.2f.", totalAverageGrade);
    }
}
