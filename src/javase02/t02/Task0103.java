package javase02.t02;

import java.util.Scanner;

public class Task0103 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите начало отрезка a");
        double a = scanner.nextDouble();
        System.out.println("Введите конец отрезка b");
        double b = scanner.nextDouble();
        System.out.println("Введите шаг вычисления h");
        double h = scanner.nextDouble();
        for (double x = a; x <= b; x = x + h) {
            double tg = Math.tan(2 * x) - 3;
            System.out.printf("%-6.2f | %-11.4f%n", x, tg);
            System.out.println("_______|_________");
        }
    }


}
