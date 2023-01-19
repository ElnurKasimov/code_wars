package Kju_8;

/*
класс находит корень введенного числа (всегда однозначное число)
Как высчитывается корень
12 -> 1 + 2 = 3, корень 3
869 -> 8 + 6 + 9 = 23, -> 2 + 3 = 5, корень 5
 */

import java.util.Scanner;

public class BaseNumber {

    public static void main(String[] args) {
        System.out.println("Введите целое число :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number / 10 != 0) {
            int result = getSum(number);
            number = result;
        }
        sc.close();
        System.out.println("Корень вашего числа :" + number);
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n%10 != 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Сумма = " + sum);
        return sum;
    }
}
