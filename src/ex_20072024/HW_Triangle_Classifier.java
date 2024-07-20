package ex_20072024;

import java.util.Scanner;

public class HW_Triangle_Classifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side1");
        int side1 = sc.nextInt();

        System.out.println("Enter side2");
        int side2 = sc.nextInt();

        System.out.println("Enter side3");
        int side3 = sc.nextInt();

        // Compare the three sides using conditional loop

        if (side1 == side2 && side1 == side3)
        {
            System.out.println("The triangle is equilateral");
        }
        else if (side1 == side2 || side1 == side3 || side2==side3)
        {
            System.out.println("This is a isosceles triangle");
        }
        else
        {
            System.out.println("This is a scalene triangle");
        }
    }
}
