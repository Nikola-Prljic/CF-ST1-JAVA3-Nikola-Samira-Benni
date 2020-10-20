package Nikola;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args){

        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        int num1 = SCA.nextInt();
        System.out.print("Enter your number 2 : ");
        int num2 = SCA.nextInt();
        System.out.print("Enter your number 3 : ");
        int num3 = SCA.nextInt();


        //solution with if
        if (num1 == num2 && num2 == num3){
            System.out.println("The numbers are the same!");
        }
        else if (num1 == num2 && num2 > num3){
            System.out.println("Number 1 and Number 2 are the same and bigger than " + num3);
        }
        else if (num1 > num2 && num1 > num3){
            if (num2 > num3) {
                System.out.println("The biggest one is " + num1 + " the 2nd one is " + num2 + ", and the smallest one is " + num3);
            }
            else if (num2 < num3){
                System.out.println("The biggest one is " + num1 + " the 2nd one is " + num3 + ", and the smallest one is " + num2);
            }
        }
        else if (num2 > num1 && num2 > num3 && num1 > num3){
            if (num2 > num3) {
                System.out.println("The biggest one is " + num1 + " the 2nd one is " + num2 + ", and the smallest one is " + num3);
            }
            else if (num2 < num3){
                System.out.println("The biggest one is " + num1 + " the 2nd one is " + num3 + ", and the smallest one is " + num2);
            }
        }
        else {
            System.out.println(num3 + " is the biggest number<");
        }
    }
}
