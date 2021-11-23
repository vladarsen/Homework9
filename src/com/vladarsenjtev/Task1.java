package com.vladarsenjtev;
/*
В банк положили s денег. Какой станет сумма вклада через n лет, если процент 1,5%
добавляется к сумме вклада ежемесячно.
Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        int sum = scanner.nextInt();
        System.out.println("Введите количество лет");
        int years = scanner.nextInt();
        System.out.printf("Сумма вклада составит: %.2f", depositSum(sum, years));
    }

    public static double depositSum(int sum, int years) {
        return sum * (Math.pow((1 + 0.015), years));
    }
}
