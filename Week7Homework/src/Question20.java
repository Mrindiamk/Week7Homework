import java.util.Arrays;

/*20. Write a Java program to sort a numeric array and a string array.*/
public class Question20 {
    public static void main(String[] args) {

        int[] numericArray = {9, 6, 7, 2, 5, 8};
        String[] stringArray = {"Amin", "Vraj", "Shrey", "Pinky", "Vijo", "Bhaylu"};

        System.out.println(Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array is : "+Arrays.toString(numericArray));

        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array is : "+Arrays.toString(stringArray));

    }
}
