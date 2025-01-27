package tutorial_2;
/*11.	Generate the following pattern:
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1 

*/

public class Q11 {

    public static void main (String []args){

        int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();

        }
    
    }

}
