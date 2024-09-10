

public class EvenOddException {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n1 = 18;
        tryNumber(n1);

        int n2 = 7;
        tryNumber(n2);
    }

    public static void tryNumber(int n) {
        try {
            checkEven(n);
            System.out.println(n + " is even");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkEven(int number) {
        if (number % 2 != 0) {  // Check if the number is odd
            throw new IllegalArgumentException(number + " is odd");
        }
    }
}
