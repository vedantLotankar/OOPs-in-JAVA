package tutorial_1;
/*6. Write a Java program that takes an integer n as input 
and prints the multiplication table for that number up to 10. */

import java.util.Scanner;

public class Q6{
	public static void main (String[] args){

		Scanner cin = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = cin.nextInt();

		for(int i = 1 ; i < 11 ; i++ ){

			System.out.println(num + " x " + i + " = " + num*i);

		}

		cin.close();
			
	} 

}
