package basic.homeworks;

import java.util.Scanner;

public class FirstHomework {
    public static void main(String[] args) {
        // Напишите программу, которая выводит на экран сумму двух чисел.
        int a = 54;
        int b = 16;
        System.out.println(a + b);

        // Напишите программу, которая выводит на экран результат деления двух чисел.
        int c = 50;
        int d = 3;
        System.out.println(c / d);

        // Напишите программу, которая выводит на экран результат следующих операций:
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);

        /**
         * Напишите программу, которая выводит на экран значение переменной типа инт в квадрате (n* n).
         * Предварительно получите значение этой переменной от пользователя при помощи scanner.
          */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = scan.nextInt();
//        System.out.println(number * number);

        /**
         * Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
         * Объявите ещё одну переменную и сохраните в неё сумму этих переменных, деленную на 10.
         * Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
         * Распечатайте её через println.
         * Задайте финальную переменную такого типа,
         * чтобы можно было видеть точное значение средней арифметической.
         */
        int nOne = 0;
        int nTwo = 1;
        int nThree = 2;
        int nFour = 3;
        int nFive = 4;
        int nSix = 5;
        int nSeven = 6;
        int nEight = 7;
        int nNine = 8;
        int nTen = 9;
        int nSum = (nOne + nTwo + nThree + nFour + nFive + nSix + nSeven + nEight + nNine + nTen) / 10;
        System.out.println(nSum);
        float sumPrecise = nSum;
        System.out.println(sumPrecise);

        /**
         * Пусть цена товара A обычно составляет 1000 евро, и товара B составляет 500 евро.
         * Если клиент покупает товары вместе, то на них действует скидка 100 евро на всю покупку.
         * Выведите на экран переменную, которая соответствует проценту скидки от суммы.
         */
        int A = 1000;
        int B = 500;
        int C = 100;
        double x = A + B;
        double y = C;
        double discount = y / x * 100;
        System.out.println(discount);
    }
}
