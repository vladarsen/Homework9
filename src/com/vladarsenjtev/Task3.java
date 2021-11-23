package com.vladarsenjtev;
/*
3) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
Входящие параметры: массив и число.
(считаем что массива который нам передали отсортирован, проверять это не нужно)
*/

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arrs = new int[]{15, 78, 124, 339};
        System.out.println(Arrays.toString(arrs));
        binarySearch(arrs, 78);
    }

    public static void binarySearch(int[] input, int number) {

        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (input[middle] < number) {
                first = middle + 1;
            } else if (input[middle] == number) {
                System.out.println("Число " + number + " найдено в индексе " + middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Числа нет в массиве");
        }
    }
}

