
public class ExceptionEx1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            int r = divideNumbers(5, 0);
            System.out.println("Result: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot Divide The Given Number By Zero!");
        }
        return dividend / divisor;
    }
}
