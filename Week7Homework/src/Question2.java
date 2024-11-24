/* 2. Declare array and store any 5 countries and print them in console.*/
public class Question2 {
    public static void main(String[] args) {
        String[] name = {"UK ", "Canada ", "Usa ", "India ", "Australia "};
//        System.out.println(name[0]+ name[1]+ name[2]+name[3]+name[4]);

        //       String[] name = new String[]{"UK ", "Canada ", "Usa ", "India ", "Australia "};
        //      System.out.println(Arrays.toString(name));

        for(int i=0 ; i<=name.length-1; i++){
            System.out.println(name[i]);
        }
    }
}
