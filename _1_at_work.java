package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */
public class _1_at_work {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Current hour (0-24):");

        int userHour = sc.nextInt();

        if(userHour >= 0 && userHour < 25){
            if(userHour >=9 && userHour <= 18){
                System.out.println("It's " + userHour + ":00 now. I'm on work.");
            } else {
                System.out.println("It's " + userHour + ":00 now. I have a rest.");
            }
        } else {
            System.out.println("Make sure your number is in range 0 - 24!");
        }

    }
}
