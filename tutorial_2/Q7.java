package tutorial_2;
import java.util.Scanner;
/*8. Write a Java program that calculates the factorial of a given number using recursion.*/

public class Q7 {
    public static void main(String[] args) {

	Scanner cin = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = cin.nextInt();

	int temp = num;
	int rev = 0;
	
	while(temp != 0){

		rev = rev*10 + temp % 10;
		temp /= 10; 	

	}

	System.out.print("Reverse number: "+rev);

    }
    
}