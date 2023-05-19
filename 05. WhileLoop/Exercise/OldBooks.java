package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favoriteBook = scanner.nextLine();
        String book = scanner.nextLine();
        int bookCount = 0;
        boolean foundBook = false;
        while (!book.equals("No More Books")) {

            if (book.equals(favoriteBook)) {
                foundBook = true;
                System.out.printf("You checked %d books and found it.", bookCount);
                break;
            }
            bookCount++;
            book = scanner.nextLine();
        }
        if (!foundBook) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
