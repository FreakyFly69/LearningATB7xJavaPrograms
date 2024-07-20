package ex_20072024;

import java.util.Scanner;

public class HW_Leap_Year {
    public static void main(String[] args) {

        //Verify that given year in the input is a leap year

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter year below");
        int year = sc.nextInt();

        if(year%400==0)
        {
            System.out.println(year + " is a leap year");
        }
        else if (year%100==0)
        {
            System.out.println(year + " is not a leap year");

        }
        else if (year%4==0)
        {
            System.out.println(year + " is a leap year");
        } else {

            System.out.println(year + " is not a leap year");
        }


    }

}
