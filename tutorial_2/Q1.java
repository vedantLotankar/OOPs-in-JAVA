package tutorial_2;

/*1. WAP to accept 3 nos. From command line arguments 
and print maximum, minimum and total of all three nos. */

public class Q1 {
    public static void main (String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int max = Math.max(num3, Math.max(num1,num2));
        int min = Math.min(num3, Math.min(num1,num2));
        int sum = num1 +  num2 + num3;

        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
        System.out.println("sum: "+ sum);

    }
}

