package week1.week1Homework.main;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * Посчитать сколько раз встречается символ 5 в заданном числе, которое вводит юзер (число трехкратное)
 435  -   1
 505  -   2
 555  -   3
 305 - 1
 */
public class _9_occur {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int wholeNumber;

        System.out.println("Please enter your 3-digit number here: ");

        wholeNumber = sc.nextInt();

        if(wholeNumber > 99 && wholeNumber < 1000){
            int a,b,c;
            a = wholeNumber / 100;
            b = (wholeNumber / 10) % 10;
            c = wholeNumber % 10;

            byte count = 0;

            System.out.println("Enter number to check:");
            byte numberToCheck = sc.nextByte();


            if(a == numberToCheck){
                count++;
            }
            if(b == numberToCheck){
                count++;
            }
            if(c == numberToCheck){
                count++;
            }
            System.out.println("Number of occurrences of " + numberToCheck + " = " + count);

        } else {
            System.out.println("Your number is invalid!");
        }

    }
}
