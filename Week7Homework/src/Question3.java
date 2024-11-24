/*3. Declare multidimensional array and store 5 countries and their capital and print them in
console.*/
public class Question3 {
    public static void main(String[] args) {
      /*  |   usa    |  Newyork     |
          |   India  |  Delhi       |
          |   Canada | Ottawa       |
          |   China  |  Beijing     |
          |   Japan  |   Tokyo      |*/

        String[][] display = new String[5][2];
        display[0][0] = "usa";
        display[0][1] = "Newyork";
        display[1][0] = "India";
        display[1][1] = "Delhi";
        display[2][0] = "Canada";
        display[2][1] = "Ottawa";
        display[3][0] = "China";
        display[3][1] = "Beijing";
        display[4][0] = "Japan";
        display[4][1] = "Tokyo";
        for (int i = 0; i <= display.length - 1; i++) {
            for (int j = 0; j < display[i].length; j++) {
                System.out.println(display[i][j]);
            }
        }
    }
}
