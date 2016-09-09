package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
 Если второе больше, то выводим сумму.
 */
public class _5_dif_sum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = sc.nextDouble();

        System.out.println("Enter b:");
        double b = sc.nextDouble();

        if(a > b){
            System.out.println("a - b = " + (a - b));
        } else if(a < b){
            System.out.println("a + b = " + (a + b));
        } else {
            System.out.println("a = b");
        }

    }
}
