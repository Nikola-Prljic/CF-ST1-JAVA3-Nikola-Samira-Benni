package Samira;

import java.util.Scanner;

public class Task3part2 {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Here: ");
        number = input.nextInt();
        //using switch to get different results with different numbers
        switch(number){
            case 1:
                System.out.println("today is Monday");
                break;
            case 2:
                System.out.println("today is Tuesday");
                break;
            case 3:
                System.out.println("today is Wednesday");
                break;
            case 4:
                System.out.println("today is Thursday");
                break;
            case 5:
                System.out.println("today is Friday");
                break;
            case 6:
                System.out.println("today is Saturday");
                break;
            case 7:
                System.out.println("today is Sunday");
                break;
            case 8:
                System.out.println("Week only has 7 days");
        }
    }

}
