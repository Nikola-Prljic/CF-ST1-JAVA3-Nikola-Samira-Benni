package Nikola;

import java.util.Scanner;

public class main7 {
    public static void main(String[] args){

        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        int num1 = SCA.nextInt();
        System.out.print("Enter your number 2 : ");
        int num2 = SCA.nextInt();
        System.out.print("Enter your number 3 : ");
        int num3 = SCA.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("all the same");
        }
        else {
            int max1 = Math.max(num1, num2);
            System.out.println(Math.max(max1, num3) + " is the bigger number");
        }
        //solution with if
        if (num1 == num2 && num2 == num3){
            System.out.println("The numbers are the same!<");
        }
        else if (num1 == num2 && num2 > num3){
            System.out.println("Number 1 and Number 2 are the same and bigger than " + num3);
        }
        else if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the biggest number<");
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the biggest number<");
        }
        else {
            System.out.println(num3 + " is the biggest number<");
        }
    }
}
