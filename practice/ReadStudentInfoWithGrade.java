import java.util.*;
public class ReadStudentInfoWithGrade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int rollno;
		float per;
		int grade;
		
		System.out.print("Enter Roll No:");
		rollno = s.nextInt();

		name = s.nextLine();
		System.out.print("Enter Name:");
		name = s.nextLine();

		System.out.print("Enter Percentage:");
		per = s.nextFloat();
		
		if(per>=75)
			grade = 1;
		else if(per<75 && per>=60)
			grade = 2;
		else if(per<60 && per>=50)
			grade = 3;
		else if(per<50 && per>=40)
			grade = 4;
		else
			grade = 5;
		
		switch(grade) {
			case 1:
				System.out.println("A grade!");
				break;
			case 2:
				System.out.println("B grade!");
				break;
			case 3:
				System.out.println("C grade!");
				break;
			case 4:
				System.out.println("D grade!");
				break;
			case 5:
				System.out.println("Failed");
				break;
		}
		// System.out.println("\nDisplaying Information:");
		// System.out.println("Student's Name:"+name+"\nStudent's Roll No:"+rollno+"\nStudent's Percentage:"+per);
	}
}
