package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        int soldTicketsTotal = 0;
        while (!movieName.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            String seatType = scanner.nextLine();
            int soldTickets = 0;
            while (!seatType.equals("End")) {
                soldTickets++;
                soldTicketsTotal++;
                switch (seatType) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }
                if (soldTickets == seats) {
                    break;
                }
                seatType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", movieName, soldTickets * 1.0 / seats * 100);
            movieName = scanner.nextLine();
        }
        double percentStudents = studentCount * 1.0 / soldTicketsTotal * 100;
        double percentStandard = standardCount * 1.0 / soldTicketsTotal * 100;
        double percentKid = kidCount * 1.0 / soldTicketsTotal * 100;
        System.out.printf("Total tickets: %d\n%.2f%% student tickets.\n%.2f%% standard tickets.\n%.2f%% kids tickets.",
                soldTicketsTotal, percentStudents, percentStandard, percentKid);
    }
}
