import java.util.Scanner;

/*13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/
public class Question13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your First Number:");
        int number1 = scan.nextInt();

        System.out.println("Please Enter Your Second Number:");
        int number2 = scan.nextInt();
        String name = scan.nextLine();

        System.out.println("Please Enter Any Symbol from (+,-,/,*): ");
        char symbol = scan.next().charAt(0);

        if(symbol=='+'){
            System.out.println(number1+number2);}
        else if(symbol=='-'){
            System.out.println(number1-number2);}
        else if(symbol=='*'){
            System.out.println(number1*number2);}
        else if(symbol=='/'){
            System.out.println(number1/number2);}
        else {
            System.out.println("INVALID");

        }



    }

}
