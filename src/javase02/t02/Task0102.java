package javase02.t02;

import java.util.Scanner;

public class Task0102 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите граничное условие e");
        double e = scanner.nextDouble();
        int i = 1;
        while (true) {
            double a = 1 / (Math.pow((i + 1), 2));
            System.out.format("a[" + i + "]=" + "%.3f%n", a);
            if (a < e) {
                System.out.println("Минимальный номер элемента последовательности, для которого выполняется условие - " + i);
                break;
            }
            i++;
        }
    }
}