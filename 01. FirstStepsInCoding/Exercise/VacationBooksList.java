package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int bookHours = pagesInBook / pagesPerHour;
        int bookDays = bookHours / days;
        System.out.println(bookDays);

    }
}
