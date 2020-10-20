package Nikola;

import java.util.Scanner;

public class Main4 {
    //Write a program to find maximum between two numbers.
    public static void main(String[] args){

        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        int i = SCA.nextInt();
        System.out.print("Enter your number 2 : ");
        int x = SCA.nextInt();

        //solution with if
        if (i == x){
            System.out.println("The numbers are the same!");
        }
        else if (i > x){
            System.out.println(i + " is bigger than " + x);
        }
        else {
            System.out.println(i + " is smaller than " + x);
        }

        //solution with Math.max
        System.out.println(Math.max(i, x) + " is the bigger number");


    }
}
