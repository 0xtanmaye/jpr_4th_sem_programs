public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int num1, int num2) throws DivideByZeroException {
        if (num2 == 0) {
            throw new DivideByZeroException("Cannot divide by zero!");
        }

        return num1 / num2;
    }
}

class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}