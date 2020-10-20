package Nikola;

import java.util.Scanner;

public class Main3to2 {
    public static void main(String[] args){
        Scanner SCA = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i = SCA.nextInt();

        switch (i) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            case 8 -> System.out.println("The week has only 7 days");
            default -> System.out.println("Not found. Number between 1-7");
        }

    }
}
