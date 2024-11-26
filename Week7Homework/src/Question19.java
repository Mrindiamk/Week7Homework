import java.util.Scanner;

/*19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”*/
public class Question19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Number:");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println(number + " is Positive Number.");
        } else if (number < 0) {
            System.out.println(number + " is Negative Number.");
        } else {
            System.out.println(number+ " is Zero.");
        }
    }
}
