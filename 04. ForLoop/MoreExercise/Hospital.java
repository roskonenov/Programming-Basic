package ForLoop.MoreExercise;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int unattendedPatients = 0;
        int attendedPacients = 0;
        for (int i = 1; i <= n; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (unattendedPatients > attendedPacients) {
                    doctors++;
                }
            }
            if (patients > doctors) {
                unattendedPatients += (patients - doctors);
                attendedPacients += doctors;
            } else {
                attendedPacients += patients;
            }

        }
        System.out.printf("Treated patients: %d.\nUntreated patients: %d.", attendedPacients, unattendedPatients);
    }
}
