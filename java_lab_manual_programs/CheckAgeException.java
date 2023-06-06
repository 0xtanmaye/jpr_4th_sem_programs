import java.util.Scanner;

public class CheckAgeException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            throw new Exception("Age cannot be negative");
        }
        System.out.println("Your age is: " + age);
    }
}