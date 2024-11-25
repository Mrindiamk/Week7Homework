import java.util.Scanner;

/*15. Write a program that tells us input value is number or an alphabet or symbol.*/
public class Question15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your Input: ");
        char input = scan.next().charAt(0);

        if(Character.isAlphabetic(input)){
            System.out.println(input +" is an Alphabet");}
        else if(Character.isDigit(input)){
            System.out.println(input +" is a Number");}
        else {
            System.out.println(input +" is a Symbol");}

        }
    }



