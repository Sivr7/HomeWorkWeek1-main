package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class _4_floating_point {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number in [0 - 1) range:");

        double a = sc.nextDouble();

        if(a >= 0 && a < 1){
            System.out.println("Number " + a + " is in [0 - 1) range.");
        } else {
            System.out.println("Number " + a + " is NOT in [0 - 1) range.");
        }
    }
}

