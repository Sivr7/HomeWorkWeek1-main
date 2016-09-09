package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 124    4    -   true
 1456   567  -   false
 1      2    -   false
 18 98 - true
 */
public class _8_lastNs {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        if(a % 10 == b % 10){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}
