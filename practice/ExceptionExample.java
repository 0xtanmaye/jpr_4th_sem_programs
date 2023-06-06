import java.util.Scanner;
class AgeException extends Exception {
	AgeException(String message){  
		super(message);  
	}  
}
public class ExceptionExample {
	public static void main(String args[]) {
			
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		try{  
			if (age<18) {
				throw new AgeException("\n"+"You must be 18+ to sign up");  
			} else {
				System.out.println("You are now signed up!");
			}
		} catch (AgeException e) {
			System.out.println("A problem occured: "+e);
		}
	}  
}
