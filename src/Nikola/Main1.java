package Nikola;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){

        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i = SCA.nextInt();
        if (i > 0){
            System.out.println(i + " // This number is positive");
        }
        else {
            System.out.println(i + " // This number is negative");
        }
    }
}
