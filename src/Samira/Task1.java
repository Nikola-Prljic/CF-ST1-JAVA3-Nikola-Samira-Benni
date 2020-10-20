package Samira;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //a program to verify positive and negative numbers
        int number; //is a variable
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Here: ");
        number = input.nextInt();
        if (number>0) {
            System.out.println(number + " " + "is Positive");
        }
        else if (number<0) {
            System.out.println(number +" " + "is Negative");

        }




    }
}
