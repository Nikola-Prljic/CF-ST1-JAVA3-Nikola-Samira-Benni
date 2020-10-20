package Samira;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Here: ");
        number = input.nextInt();
        if (number==1) {
            System.out.println("today is Monday");
        }
        else if (number==2) {
            System.out.println("today is Tuesday");
        }
        else if (number==3) {
            System.out.println("today is Wednesday");
        }
        else if (number==4) {
            System.out.println("today is Thursday");
        }
        else if (number==5) {
            System.out.println("today is Friday");
        }
        else if (number==6) {
            System.out.println("today is Saturday");
        }
        else if (number==7) {
            System.out.println("today is Sunday");
        }
        else {
            System.out.println("Week only has 7 days");
        }
    }

}
