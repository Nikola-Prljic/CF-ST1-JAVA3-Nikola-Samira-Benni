package Samira;

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {

        float number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Here: ");
        number = input.nextInt();
        if (number == 0){
            System.out.println("// Number is zero");
        }
        else if(number >0){
            if(number > 1000000){
                System.out.println(" is a large positive number");
            }
            else if(number<1){
                System.out.println(" is a small positive number");
            }
            else{
                System.out.println(" is a positive number");
            }

        }
        else if(number <0){
            System.out.println(" is Negative number");
        }




    }
}



