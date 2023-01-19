package Kju_8;
/*
класс проверяет является ли число number полным квадратом от какого либо числа
 */
import java.lang.Math;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("input integer number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isSquare(number)) {
            int round = (int) Math.sqrt(number);
            System.out.println(number + " is square for " + round);
        } else {
            System.out.println(number + " is not square");
        }
    }
    public static boolean isSquare (int n) {
        double squareRoot = Math.sqrt(n);
        double squareRootInt = Math.floor(squareRoot);
        if (Math.abs(squareRoot - squareRootInt) < 0.000000001){
            return true;
        } else {
          return false;
        }
    }
}

/*  наилучшим же решением является
public class Square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
 */
