package javase02.t02;

import java.util.Scanner;

public class Task0102 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество элементов n");
        int n = scanner.nextInt();
        System.out.println("Введите граничное условие e");
        double e = scanner.nextDouble();
        boolean notFound = true;
        for (int i = 1; i <= n; i++) {
            double a = 1 / (Math.pow((i + 1), 2));
            System.out.format("%.3f%n", a);
            if (a < e && notFound) {
                System.out.println("Минимальный номер элемента последовательности, для которого выполняется условие - " + i);
                notFound = false;
            }
        }
    }
}