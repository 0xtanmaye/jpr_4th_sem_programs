import java.util.Scanner;
import java.io.*;
public class FileDuplicate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the file you want to create a copy of or input from: ");
		String in_file = input.nextLine();
		System.out.print("Enter the name of the duplicate file to be created or modified: ");
		String out_file = input.nextLine();		
		
		File inf = new File(in_file);
		try {
			if(!inf.exists()) {
			throw new Exception("The input file doesn't exist");
			}
		} catch(Exception e) {
			System.err.println("An error occurred: "+e.getMessage());
			System.exit(1);
		}
		
		File outf = new File(out_file);
		try {
			if(!outf.exists()) {
				char choice; 
				do {
					System.out.print("The output file with name " + out_file + " doesn't exist, would you like to create it?(y/n) : ");
					choice = input.next().charAt(0);
					if(choice == 'y' || choice == 'Y') {
						outf.createNewFile();
						System.out.println("A new file with name " + out_file + " successfully created");
					}
					else if(choice == 'n' || choice == 'N') {
						System.out.println("Not creating the file, Exiting the program...");
						System.exit(0);
					}
					else {
						System.out.println("Please enter a valid choice!");
					}
				} while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N');
			} else {
				char choice;
				do {
					System.out.print("A file with name " + out_file + " already exists. Would you like to modify it?(y/n) : ");
					
					choice = input.next().charAt(0);
					if(choice == 'y' || choice == 'Y') {
						System.out.println("The file " + out_file + " will be modified");
					}
					else if(choice == 'n' || choice == 'N') {
						System.out.println("Not modifying the file " + out_file + ", Exiting the program...");
						System.exit(0);
					}
					else {
						System.out.println("Please enter a valid choice!");
					}
				} while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N');
			}
		} catch(Exception e) {
			System.err.println("An error occured!");
			e.printStackTrace();
		}
		try {
			FileInputStream fi = new FileInputStream(in_file);
			FileOutputStream fo = new FileOutputStream(out_file);

			byte[] inBytesBuff = new byte[(int) inf.length()];
			int bytesRead = fi.read(inBytesBuff);
			System.out.println(bytesRead + " bytes read from " + in_file);
			fo.write(inBytesBuff);
			System.out.println(bytesRead + " bytes written to " + out_file);
			fi.close();
			fo.close();
		} catch(FileNotFoundException e) {
			System.err.println("The input/output file not found");
		} catch(IOException e) {
			System.err.println("An I/O error occurred!");
			e.printStackTrace();
		}
	}
}
