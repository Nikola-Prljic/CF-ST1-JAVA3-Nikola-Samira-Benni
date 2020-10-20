package Samira;
import java.util.Scanner;
public class Task9 {

    static void myMethod() {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = input.nextInt();
        if (age >=18) {
            System.out.println(" you are eligible to vote");
        }
        else {
            System.out.println(" you are not eligible to vote");
        }

    }

    public static void main(String[] args) {
        myMethod();









    }
}
