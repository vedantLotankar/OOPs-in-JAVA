package tutorial_2;
import java.util.Scanner ;
/*6. Write a Java program that checks whether a given number is an
 Armstrong number. An Armstrong number is a number that is equal to
  the sum of its own digits raised to the power of the number of digits.*/

public class Q6 {
    public static void main (String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = cin.nextInt();

        int temp = num;
        int sum = 0;
        int count = 0;

        while(temp != 0){
            count++;
            temp /= 10;
        }

        temp = num;
        while(temp != 0){
            sum += Math.pow(temp % 10, count);
            temp /= 10;
        }

        if(sum == num){
            System.out.print(num+" is an Armstrong number.");
        }else{
            System.out.print(num+" is not an Armstrong number.");
        }
        
        cin.close();

    }
    
}
