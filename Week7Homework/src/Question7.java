/*7. Write a java program to input any number and find out if it’s odd or even.2*/
import java.util.Scanner;

public class Question7 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scan.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even number ");
        else
            System.out.println(num + " is odd number ");

    }
}

