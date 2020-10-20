package Nikola;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args){

        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float i = SCA.nextFloat();
        if (i == 0){
            System.out.println("// Number is zero");
        }
        else if(i <= 1){
            if(i > 0){
                System.out.println("// This is a small positive number");
            }
            else{
                System.out.println("// This is a small negative number");
            }

        }
        else if(i > 1000000){
            System.out.println("// This is a lage positive number");
        }
        else {
            System.out.println("// This is a positive number");
        }
    }
}
