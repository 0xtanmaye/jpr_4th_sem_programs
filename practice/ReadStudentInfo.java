import java.util.*;
public class ReadStudentInfo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int rollno;
		float per;

		System.out.print("Enter Roll No:");
		rollno = s.nextInt();

		name = s.nextLine();
		System.out.print("Enter Name:");
		name = s.nextLine();

		System.out.print("Enter Percentage:");
		per = s.nextFloat();

		System.out.println("\nDisplaying Information:");
		System.out.println("Student's Name:"+name+"\nStudent's Roll No:"+rollno+"\nStudent's Percentage:"+per);
	}
}
