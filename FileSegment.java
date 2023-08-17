import java.util.Scanner;
import java.io.*;
public class FileSegment {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to segement(s/S) or integrate(i/I)? ");
		char choice = input.nextLine().charAt(0);
		if (choice == 's' || choice == 'S') {
			System.out.print("Enter the name of the file you want to create segments of: ");
			String in_file = input.nextLine();
			System.out.print("Enter the number of segments you want to create: ");
			File inf = new File(in_file);
			try {
				if(!inf.exists()) {
					throw new Exception("The input file doesn't exist");
				}
			} catch (Exception e) {
				System.err.println("An error occurred: "+e.getMessage());
				System.exit(1);
			}
			int noOfSegments = input.nextInt();
			FileInputStream fi = new FileInputStream(in_file);
			long inFileSize = inf.length();
			int segSize = (int) inFileSize/noOfSegments;
			if (inFileSize % segSize != 0 && (inFileSize % segSize) < segSize) {
				noOfSegments++;
				System.out.println("To evenly divide the file into segments, the number of segments has been increased by 1\nNumber of segments = " + noOfSegments++);
			}
			byte[] segBuffer = new byte[segSize];
			int segCount;
			for (segCount = 0; segCount <= noOfSegments; segCount++) {
				int buffBytesRead = fi.read(segBuffer);
				if (buffBytesRead == -1) {
					break;
				}
				FileOutputStream segOS = new FileOutputStream(in_file + "_" + segCount);
				segOS.write(segBuffer, 0, buffBytesRead);
				segOS.close();
			}
			System.out.println("Successfully segmented " + in_file + " into " + segCount + " segments.");
			fi.close();
		} else if (choice == 'i' || choice == 'I') {
			System.out.print("Enter the prefix of segment files: ");
			String seg_prefix = input.nextLine();
			System.out.print("Enter the name of the integrated file to be created or modified: ");
			String int_file = input.nextLine();
			System.out.print("Enter the number of segments: ");
			int noOfSegments = input.nextInt();
			FileOutputStream intOS = new FileOutputStream(int_file);
			int segCount;
			for (segCount = 0; segCount < noOfSegments; segCount++) {
				FileInputStream segIS = new FileInputStream(seg_prefix + "_" + segCount);
				int b;
				while ((b = segIS.read()) != -1) {
					intOS.write(b);
				}
				segIS.close();
			}
			System.out.println("Successfully integrated " + seg_prefix + " (" + segCount + ") files into " + int_file);
			intOS.close();
		}
	}
}
