package Samira;

public class Task7 {
    public static void main(String[] args) {
        int num1 = 52;
        int num2 = 24;
        int num3 = 11;
        //useing if statement to find the highest number
        if(num1>num2 && num1>num3) {
            System.out.println(num1 + " is maximun");
        }
        else if(num2>num1 && num2>num3) {
            System.out.println(num2 + " is maximum");
        }
        else {
            System.out.println(num3 + " is maximum");
        }

    }

}
