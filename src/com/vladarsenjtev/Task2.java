package com.vladarsenjtev;

/*
2) Реализовать метод который вернет строку String,
в которой через пробел все числа от 1 до 99 со следующими изменениями:
(!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)
- если число кратно 3 то вывести вместо него Hello
- если число кратно 5 то вывести вместо него World
- если число кратно и 3 и 5 то вывести вместо него HelloWorld
*/

public class Task2 {
    public static void main(String[] args) {
        System.out.println(stringNumber());
    }
    public static String stringNumber() {
        int[] number = new int[99];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
            if ((number[i] % 3) == 0 && (number[i] % 5) == 0) {
                builder.append("HelloWorld ");
            } else if ((number[i] % 5) == 0) {
                builder.append("World ");
            } else if ((number[i] % 3) == 0) {
                builder.append("Hello ");
            } else builder.append(i + 1).append(" ");
        }
        return builder.toString();
    }
}
