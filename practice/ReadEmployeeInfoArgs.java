import java.util.*;
public class ReadEmployeeInfoArgs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int empno;
		float salary;

		empno = Integer.parseInt(args[0]);
		name = args[1];
		salary = Float.parseFloat(args[2]);

		System.out.println("Displaying Information:");
		System.out.println("Employee's Name:"+name+"\nEmployee No:"+empno+"\nEmployee's Salary:"+salary);
	}
}
