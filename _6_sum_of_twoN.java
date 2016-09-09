package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */
public class _6_sum_of_twoN {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = sc.nextDouble();

        System.out.println("Enter b:");
        double b = sc.nextDouble();

        if(a + b >= 11 && a + b <=19){
            System.out.println("a + b = " + (a + b));
        } else {
            System.out.println("SUM not in [11 - 19] range!");
        }

    }
}
