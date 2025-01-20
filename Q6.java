import java.util.Scanner;

public class Q6{
	public static void main (String[] args){

		Scanner cin = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = cin.nextInt();

		for(int i = 1 ; i < 11 ; i++ ){

			System.out.println(num + " x " + i + " = " + num*i);

		}
			
	} 

}
