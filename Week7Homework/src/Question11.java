import java.util.Scanner;

/*11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.*/
public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter any character to A to F");
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("a")) {
            System.out.println("Ahmedabad");
        } else if (city.equalsIgnoreCase("b")) {
            System.out.println("bombay");
        } else if (city.equalsIgnoreCase("c")) {
            System.out.println("calcutta");
        } else if (city.equalsIgnoreCase("d")) {
            System.out.println("delhi");
        } else if (city.equalsIgnoreCase("e")) {
            System.out.println("Edgware");
        } else if (city.equalsIgnoreCase("f")) {
            System.out.println("Franca");
        } else {
            System.out.println("Invalid Entry.");
        }
    }
}

