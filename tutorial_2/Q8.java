package tutorial_2;
import java.util.Scanner;
/*8. Write a Java program that calculates the factorial of a given number using recursion.*/

public class Q8 {
    public static void main(String[] args) {

	Scanner cin = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = cin.nextInt();

	System.out.println("Factorial of " + num + " is " + factorial(num));

	cin.close();
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}				
    
}

