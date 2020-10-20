public class Task6 {
    public static void main(String[] args){
        int num1 = 15;
        if(num1 % 3 == 0 && num1 % 5 == 0 ){
            System.out.println("BuzzFizz");
        }
        else if(num1 % 3 == 0) {
            System.out.println(" Fizz");
        }
        else if(num1 % 5 == 0) {
            System.out.println(" Buzz");
        }
        else {
            System.out.println(num1);
        }



    }
}
