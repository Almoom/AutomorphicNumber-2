package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int repeatQuestion = 1;
        here:
        while (repeatQuestion != 0) {
            System.out.println("Введите предел поиска автоморфных чисел - N");
            long N = scanner.nextInt();
            long square;
            for (int i = 0; i <= N; i++) {
                square = i*i;
                if (i==square) System.out.println(i + "^2 = " + square);
                else {
                    int count = (int) Math.log10(i) + 1;
                    int extra = 1;
                    for (int p = 0; p < count; ++p) extra *= 10;
                    if (square % extra == i) System.out.println(i + "^2 = " + square);
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion == 1) continue here;
            else break;
        }
    }
}
