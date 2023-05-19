package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorsName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double pointsGiven = 0;
        for (int i = 0; i < n; i++) {
            String appraisersName = scanner.nextLine();
            double appraisersPoints = Double.parseDouble(scanner.nextLine());
            pointsGiven = appraisersName.length() * appraisersPoints / 2;
            academyPoints += pointsGiven;
            if (academyPoints > 1250.5) {
                break;
            }
        }
        if (academyPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorsName, 1250.5 - academyPoints);
        }
    }
}
