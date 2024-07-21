package ex_21072024;

import java.util.Scanner;

public class HW_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial num");
        int input = sc.nextInt();

        int fact=1;
        for(int i =1; i<=input; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }

}
