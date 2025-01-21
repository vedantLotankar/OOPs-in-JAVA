package tutorial_2;
import java.util.Scanner ;
/*4. Write a Java program that checks whether 
a given number is a palindrome or not.*/


public class Q4 {
    public static void main (String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = cin.nextInt();

        int temp = num;
        int rev = 0;
        
        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if(temp == rev){
            System.out.print("The number is a palindrome");
        }
        else{
            System.out.print("The number is not a palindrome");
        }

        cin.close();

    }
    
} 