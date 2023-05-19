package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	На първия ред е месецът – May, June, July, August, September или October
        String month = scanner.nextLine();
        int overnightStays = Integer.parseInt(scanner.nextLine());
        double studio = 0.0;
        double apartment = 0.0;
        switch (month) {
            case "May":
            case "October":
                studio = overnightStays * 50;
                apartment = overnightStays * 65;
                if (overnightStays > 7 && overnightStays <= 14) {
                    studio = studio * .95;
                } else if (overnightStays > 14) {
                    studio = studio * .7;
                }
                break;
            case "June":
            case "September":
                studio = overnightStays * 75.2;
                apartment = overnightStays * 68.7;
                if (overnightStays > 14) {
                    studio = studio * .8;
                }
                break;
            case "July":
            case "August":
                studio = overnightStays * 76;
                apartment = overnightStays * 77;
                break;


        }
        if (overnightStays > 14) {
            apartment = apartment * .9;
        }
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
    }
}
