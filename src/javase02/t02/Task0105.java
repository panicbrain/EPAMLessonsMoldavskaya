package javase02.t02;


import java.util.Scanner;

public class Task0105 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Введите количество элементов в массиве n");
        double d = scanner.nextDouble();
        while (d - Math.floor(d) != 0 || d <= 0) {
            System.out.println("Количество элементов должно быть целым числом больше нуля. Введите n.");
            d = scanner.nextDouble();
        }
        int n = (int) d;
        int[][] matritsa = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (j == i || (n - 1 - i) == (n - 1 - j) || (n - 1 - j) == i || (n - 1 - i) == j) {
                    matritsa[j][i] = 1;
                } else
                    matritsa[j][i] = 0;
                System.out.print(matritsa[j][i] + " ");
            }
            System.out.println(" ");
        }

    }
}
