import java.util.Scanner;

/*6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/
public class Question6 {
    public static void main(String[] args) {
        salarySleep();
    }

    public static void salarySleep() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Employee ID:");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.println("Please Enter Employee Name:");
        String name = scan.nextLine();

        System.out.println("Please Enter Employee's Basic Salary:");
        double basicSalary = scan.nextDouble();

        double hra = basicSalary * 0.10;
        double da = basicSalary * 0.08;
        double ta = basicSalary * 0.09;
        double pf = basicSalary * 0.20;

        double grossSalary = basicSalary + hra + da + ta - pf;

        System.out.println("|-------------------------------------------|");
        System.out.println("|                Salary Slip                |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Employee Id             : " + id + "            |");
        System.out.println("| Employee Name           : " + name + "             |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Basic Salary            : " + basicSalary + "         |");
        System.out.println("| HRA 10%                 : " + hra + "          |");
        System.out.println("| DA 8%                   : " + da + "          |");
        System.out.println("| TA 9%                   : " + ta + "          |");
        System.out.println("| PF - 20%                : " + pf + "          |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Gross Salary            : " + grossSalary + "         |");
        System.out.println("|===========================================|");

    }
}
