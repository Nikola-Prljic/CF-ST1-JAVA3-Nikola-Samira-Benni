package Nikola;

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {

        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int i = SCA.nextInt();

        if (i % 3 == 0) {
            System.out.println(i + " Fizz");
        }
        else {
            System.out.println(i + " Buzz");
        }
    }
}
