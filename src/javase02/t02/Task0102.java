package javase02.t02;

import java.util.Scanner;

public class Task0102 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите граничное условие e");
        double e = scanner.nextDouble();
        int i = 0;
        double a;
        do {
            i++;
            a = 1 / (Math.pow((i + 1), 2));
            System.out.format("a[" + i + "]=" + "%.3f%n", a);
        } while (a >= e);
        System.out.println("Минимальный номер элемента последовательности, для которого выполняется условие - " + i);
        System.out.println("I just want to test my git");
    }
}