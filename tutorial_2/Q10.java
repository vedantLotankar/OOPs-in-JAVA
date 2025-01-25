package tutorial_2;

/*10.	Generate the following pattern:

    *
   ***
  *****
 *******
*********

 */

 public class Q10 {

	public static void main (String []args){

		for(int i = 1 ; i < 10 ; i = i+2){

			System.out.print(" ".repeat(4 - i/2));
			System.out.print("*".repeat(i));
			System.out.println("");
			

		}

	}	    
    
}

