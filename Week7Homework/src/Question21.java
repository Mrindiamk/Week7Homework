import java.util.Arrays;

/*21. Write a Java program to sum values of an array.*/
public class Question21 {
    public static void main(String[] args) {
        int[] number ={6,9,12,95,85};
         int sum = 0;
         for (int i=0; i<= number.length-1; i++){
             sum +=number[i];
         }
        System.out.println(Arrays.toString(number) );
        System.out.println("Sum of Array = "+sum);
    }
}
