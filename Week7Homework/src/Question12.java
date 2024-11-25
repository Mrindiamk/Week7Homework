import java.util.Scanner;

/*12. Same as above program-11 using switch statement.*/
public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any charactet to A to F");
        String city = scanner.nextLine();

        switch (city) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("Bombay");
                break;
            case "c":
                System.out.println("Calcutta");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "e":
                System.out.println("Edgware");
                break;
            case "f":
                System.out.println("Franca");
                break;

            default:
                System.out.println("Invalid Entry.");
        }
    }
}
