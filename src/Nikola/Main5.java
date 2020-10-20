package Nikola;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int i = SCA.nextInt();

        if(i % 2 == 0) {
            System.out.println(i + " is even");
        }
        else{
            System.out.println(i + " is odd");
        }

    }
}
