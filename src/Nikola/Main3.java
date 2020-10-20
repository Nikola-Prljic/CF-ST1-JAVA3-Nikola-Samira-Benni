package Nikola;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i = SCA.nextInt();

        if(i == 1){
            System.out.println("Today is Monday");
        }
        else if(i == 2){
            System.out.println("Today is Tuesday");
        }
        else if(i == 3){
            System.out.println("Today is Wednesday");
        }
        else if(i == 4){
            System.out.println("Today is Thursday");
        }
        else if(i == 5){
            System.out.println("Today is Friday");
        }
        else if(i == 6){
            System.out.println("Today is Saturday");
        }
        else if(i == 7){
            System.out.println("Today is Sunday");
        }
        else if(i == 8){
            System.out.println("The week has 7 days!");
        }
        else {
            System.out.println("Number between 1-7");
        }
    }
}
