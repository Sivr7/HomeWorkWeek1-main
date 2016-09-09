package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2.3. Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.
 */
public class _3_double_divide_by_7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");

        double a = sc.nextDouble();

        if(a % 7 == 0){
            System.out.println("2 * multiplication = " + a*2);
        }

    }
}
