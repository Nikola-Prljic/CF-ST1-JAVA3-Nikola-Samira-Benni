package Nikola;

import java.util.Scanner;

public class main6to2 {
    public static void main(String[] args) {

        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int i = SCA.nextInt();

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " Fizz buzz");
        }
        else if (i % 3 == 0) {
            System.out.println(i + " Fizz");
        }
        else if (i % 5 == 0) {
            System.out.println(i + " buzz");
        }
        else {
            System.out.println(i);
        }
    }
}
