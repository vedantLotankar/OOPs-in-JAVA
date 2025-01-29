package tutorial_3;

public class Q5 {
    public int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) {
                    System.out.print("Division by zero is not allowed.");
		    return 0;
                }
                return a / b;
            default: System.out.print("Invalid operator");
		     return 0;
        }
    }

    public static void main(String[] args) {
        Q5 calc = new Q5();
  
        System.out.println("Addition: " + calc.calculate(5, 3, '+'));
        System.out.println("Subtraction: " + calc.calculate(10, 4, '-'));
        System.out.println("Multiplication: " + calc.calculate(6, 7, '*'));
        System.out.println("Division: " + calc.calculate(20, 5, '/'));
    }
}
