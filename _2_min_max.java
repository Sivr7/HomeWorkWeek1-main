package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class _2_min_max {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers.");

        System.out.println("a:");
        int a = sc.nextInt();

        System.out.println("b:");
        int b = sc.nextInt();

        System.out.println("c:");
        int c = sc.nextInt();


        int myMin = Math.min(a, Math.min(b, c));
        System.out.println("min = " + myMin);

        int myMax = Math.max(a, Math.max(b, c));
        System.out.println("max = " + myMax);


    }
}
