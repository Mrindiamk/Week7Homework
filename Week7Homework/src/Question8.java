import java.util.Scanner;

/*8. Write a java program to get numbers from users and print whether it is positive or negative.*/
public class Question8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scan.nextInt();
        if (num < 0)
            System.out.println(num + " is Negative number ");
        else if (num > 0) {
            System.out.println(num + " is Positive number ");
        } else
            System.out.println("You Have Entered Zero.  ");

    }

}
