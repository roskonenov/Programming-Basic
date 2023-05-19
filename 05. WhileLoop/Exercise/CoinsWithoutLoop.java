package WhileLoop.Exercise;

import java.util.Scanner;

public class CoinsWithoutLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int lv = (int) sum;
        int coins = 0;
        if (lv >= 2) {
            int twoLv = lv / 2;
            coins += twoLv;
            lv -= twoLv * 2;
        }
        if (lv == 1) {
            coins ++;
        }
        double stotinkiSum = Math.round((sum % 1) * 100);
        int stotinki = (int) stotinkiSum;
        if (stotinki >= 50) {
            coins++;
            stotinki -= 50;
        }
        if (stotinki >= 20) {
            int twentySt = stotinki / 20;
            coins += twentySt;
            stotinki -= twentySt * 20;
        }
        if (stotinki >= 10) {
            coins++;
            stotinki -= 10;
        }
        if (stotinki >= 5) {
            coins++;
            stotinki -= 5;
        }
        if (stotinki >= 2) {
            int twoSt = stotinki / 2;
            coins += twoSt;
            stotinki -= twoSt * 2;
        }
        if (stotinki > 0) {
            coins++;
        }

        System.out.println(coins);
    }
}
