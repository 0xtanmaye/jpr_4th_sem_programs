import java.util.*;
class BalanceException extends Exception {
	public BalanceException(String message) {
		super(message);
	}
} 
public class BalanceUserDefinedException {
	public static void main(String[] args) {
		String name;
		int bal;
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("Enter Name: ");
			name = s.nextLine();
			System.out.print("Enter Balance: ");
			bal = s.nextInt();
			if(bal<1500) {
				throw new BalanceException("Your Balance is less than 1500");
			}
		}
		catch(BalanceException e) {
			System.out.println(e);
			//System.out.println("Error: "+e.getMessage());
		}
	}
}			
