import java.util.Scanner;

/*10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/
public class Question10 {
    public static void main(String[] args) {
        commission();
    }

    public static void commission() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Sale ID:");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.println("Please Seller's Name:");
        String name = scan.nextLine();

        System.out.println("Please Enter Sale Amount:");
        double saleAmount = scan.nextDouble();

        System.out.println("Please Enter Basic Salary:");
        double salaryBasic = scan.nextDouble();

        double commission;
        if (saleAmount >= 50000) {
            commission = saleAmount * 0.35;
        } else if (saleAmount >= 30000) {
            commission = saleAmount * 0.20;
        } else if (saleAmount >= 20000) {
            commission = saleAmount * 0.10;
        } else if (saleAmount >= 10000) {
            commission = saleAmount * 0.05;
        } else {
            commission = saleAmount * 0.02;
        }
        System.out.println("commission = " + commission);
    }
}
