package tutorial_2;
import java.util.Scanner ;
/*3. Write a Java program that prints the Fibonacci 
sequence up to the nth term, where n is provided as input. */

public class Q3 {
    public static void main (String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = cin.nextInt();

        int sum = 0;

        if(num >= 2){
            System.out.print("0 ");
            System.out.print("1 ");
        }
        else{
            System.out.print("0 ");
        }

        int a = 0;
        int b = 1;

        for(int i = 0 ; i < num ; i++){

            int c = a + b;
            System.out.print(c+" ");

            a = b;
            b = c;

        }

    }
    
}

