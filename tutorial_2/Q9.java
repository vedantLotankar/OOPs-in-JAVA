package tutorial_2;

import java.util.Scanner;
/*7. Write a Java program that reverses a given number. */

public class Q9 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
	System.out.print("Enter n1: ");
	int n1 = cin.nextInt();
	System.out.print("Enter n2: ");
	int n2 = cin.nextInt();

	System.out.println("The prime numbers between "+n1+" and "+n2+" are/is: ");

	for(int i = n1 ; i < n2+1 ; i++){

		isprime(i);

	}

	cin.close();
    
    };

    public static void isprime(int num){

	boolean ifprime = true;

	for(int i = 2 ; i <= num/2 ; i++){
	    if(num % i == 0){
		ifprime = false;
		break;
	    }
	}

	if(ifprime){
	    System.out.print(num+" ");
	}

	}

}