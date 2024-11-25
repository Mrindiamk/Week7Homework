import java.util.Scanner;

/*5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
*/

public class Question5 {
    public static void main(String[] args) {
        markSheet();
    }

    public static void markSheet() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = scan.nextLine();

        System.out.println("Enter Student Roll Number:");
        String rollNumber = scan.nextLine();

        double maths; //Define data types to Variable
        while (true) { // Infinity loop until its True
            System.out.println("Enter Maths Marks (Marks should between 0 to 100):");
            maths = scan.nextDouble();

            if (maths < 0 || maths > 100) {
                System.out.println("Invalid Input. Marks should between 0 to 100. Please enter valid Marks again.");
            } else {
                break; // breaking the loop
            }
        }

        double science;
        while (true) {
            System.out.println("Enter Science Marks (Marks should between 0 to 100):");
            science = scan.nextDouble();

            if (science < 0 || science > 100) {
                System.out.println("Invalid Input. Marks should between 0 to 100. Please enter valid Marks again.");
            } else {
                break;
            }
        }

        double english;
        while (true) {
            System.out.println("Enter English Marks (Marks should between 0 to 100):");
            english = scan.nextDouble();

            if (english < 0 || english > 100) {
                System.out.println("Invalid Input. Marks should between 0 to 100. Please enter valid Marks again.");
            } else {
                break;
            }
        }


        double total = maths + science + english;
        double percentage = total / 3;


        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60 && percentage <= 79) {
            grade = "A";
        } else if (percentage >= 50 && percentage <= 59) {
            grade = "B";
        } else {
            grade = "c";
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("|                     Mark Sheet                      |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Name                      :  " + name + "                  |");
        System.out.println("| Roll No                   :  " + rollNumber + "                     |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Subject                   :  Marks                  |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Math                      :  " + maths + "                   |");
        System.out.println("| Science                   :  " + science + "                   |");
        System.out.println("| English                   :  " + english + "                   |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Total                     :  " + total + "                  |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Percentage                :  " + percentage + "%" + "     |");
        System.out.println("| Result                    :  " + result + "                   |");
        System.out.println("| Grade                     :  " + grade + "                     |");
        System.out.println("-------------------------------------------------------");


    }
}
