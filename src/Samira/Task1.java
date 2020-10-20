package Samira;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int number;
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
