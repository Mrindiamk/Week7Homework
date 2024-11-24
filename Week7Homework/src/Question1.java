import java.util.Scanner;

/*1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)*/
public class Question1 {
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
