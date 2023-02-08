import java.util.*;
public class ReadStudentInfoArgs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int rollno;
		float per;

		rollno = Integer.parseInt(args[0]);
		name = args[1];
		per = Float.parseFloat(args[2]);

		System.out.println("Displaying Information:");
		System.out.println("Student's Name:"+name+"\nStudent's Roll No:"+rollno+"\nStudent's Percentage:"+per);
	}
}
