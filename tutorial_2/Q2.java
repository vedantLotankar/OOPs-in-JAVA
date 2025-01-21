package tutorial_2;
import java.util.Scanner ;
/*2. Write a Java program that calculates 
the sum of digits of a given integer. */

public class Q2 {
    public static void main (String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = cin.nextInt();

        int sum = 0;

        while(num != 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.print("The sum of digits is: "+sum);

        cin.close();

    }
    
}
