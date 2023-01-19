package Kju_8;
/*
класс преобразует строку в другую строку, в которой нет гласных букв
 */
import java.util.Scanner;

public class DisemvowelTrolls {

    public static void main(String[] args) {
        System.out.println("Input, please, Your string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = str.replaceAll("[AaEeIiOoUu]","");
        System.out.println(result);
        sc.close();
    }
}
