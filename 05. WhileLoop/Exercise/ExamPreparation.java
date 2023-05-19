package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unsatisfactoryGrades = Integer.parseInt(scanner.nextLine());
        int unsatisfactoryGradesCounter = 0;
        int gradesSum = 0;
        int problemsCount = 0;
        String problem = scanner.nextLine();
        String lastProblem = "";
        boolean needBreak = false;
        while (!problem.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            gradesSum += grade;
            problemsCount++;
            if (grade <= 4) {
                unsatisfactoryGradesCounter++;
                if (unsatisfactoryGrades == unsatisfactoryGradesCounter) {
                    needBreak = true;
                    System.out.printf("You need a break, %d poor grades.", unsatisfactoryGrades);
                    break;
                }
            }
            lastProblem = problem;
            problem = scanner.nextLine();
        }
        if (!needBreak) {
            System.out.printf("Average score: %.2f\n", gradesSum * 1.0 / problemsCount);
            System.out.printf("Number of problems: %d\n", problemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
