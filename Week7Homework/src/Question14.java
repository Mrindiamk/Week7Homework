import java.util.Scanner;

/*14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately.*/
public class Question14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        while (true) { // Infinity loop until its True
            System.out.println("Please Enter Number:");
            number = scan.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("Invalid Input. number should between 0 to 100. Please enter valid number again.");
            } else {
                break; // breaking the loop
            }

        }
        float d3 = (float) number/3;
        System.out.println(number+ " Is Divided By 3 = " + d3);

        float d5 = (float) number/5;
        System.out.println(number+ " Is Divided By 5 = " + d5);


    }
}
