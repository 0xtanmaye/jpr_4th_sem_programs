import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;
        try {
            System.out.print("Enter the numerator: ");
            numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Unknown exception occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program completed.");
        }
    }
}
