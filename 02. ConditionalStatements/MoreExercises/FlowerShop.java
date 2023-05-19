package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());
        double orderSum = (magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cacti * 8) - (.05 * (magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cacti * 8));
        if (presentPrice <= orderSum) {
            System.out.printf("She is left with %.0f leva.", Math.floor(orderSum - presentPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice - orderSum));
        }
    }
}
