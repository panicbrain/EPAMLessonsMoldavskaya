package javase02.t02;

import java.util.Scanner;

public class Task0104 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество элементов в массиве n");
        double d = scanner.nextDouble();
        while (d - Math.floor(d) != 0 || d <= 0) {
            System.out.println("Количество элементов должно быть целым числом больше нуля. Введите n.");
            d = scanner.nextDouble();
        }
        int n = (int) d;
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println("a[" + i + "]=" + a[i]);
        }
        for (int i = 0; i < (n+1) / 2; i++) {
            int summa = a[i] + a[n - i - 1];
            System.out.println("Summa = " + summa);
            if (max < summa) {
                max = summa;
            }
        }
        System.out.println("MAX = " + max);
    }
}


