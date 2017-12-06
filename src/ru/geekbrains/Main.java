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
            String str = Long.toString(N);
            char[] arr = str.toCharArray();
            int vol = 0;
            for (int j:arr) vol++;
            for (int i = 2; i < N; i++) {
                for (int k = 1; k < vol; k++) {
                    if (i == i * i % Math.pow(10, k))System.out.println(i);
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion == 1) continue here;
            else break;
        }
    }
}
