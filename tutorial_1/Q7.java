package tutorial_1;
/* Q7. Write a Java program that takes an integer as input 
and checks whether the number is positive, negative, or zero. */

import java.util.Scanner;

public class Q7{
	public static void main (String[] args){

		Scanner cin = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = cin.nextInt();

		if(num > 0){

			System.out.println("Positive number");

		}

		else if(num < 0){

			System.out.println("Negative number");		

		}

		else{

			System.out.print("Zero");

		}

			
	} 

}
