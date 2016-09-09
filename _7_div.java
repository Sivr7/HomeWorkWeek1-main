package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2.7. Вводим два числа, если одно из них делиться на другое без остатка,
 то выводим true и показываем результат деления (целую часть от деления  и остачу)
 в другом случае выводим false и показываем результат деления (целую часть от деления и остачу)
 */
public class _7_div {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        if(a % b == 0){
            System.out.println("true: integer => " + (a / b) + " remainder => " + (a % b));
        } else {
            System.out.println("false: integer => " + (a / b) + " remainder => " + (a % b));
        }

    }
}
