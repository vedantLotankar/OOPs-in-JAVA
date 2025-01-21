package tutorial_2;
import java.util.Scanner ;
/*5. Write a Java program that checks whether
     a given number is prime or not.*/


public class Q5 {
    public static void main (String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = cin.nextInt();

        boolean isprime = true;

        for(int i = 2 ; i <= num/2 ; i++){
            if(num % i == 0){
                isprime = false;
                break;
            }
        }

        if(isprime){
            System.out.print("The number is prime");
        }
        else{
            System.out.print("The number is not prime");
        }

        cin.close();

    }
    
} 