import java.io.*;
public class CountLines {
	public static void main(String[] args) {
		if((args.length<1)) {
			System.err.println("Usage: java CountLines filename");
			System.exit(1);
		}
		
		String filename=args[0];
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			int lineCount = 0;
			while(br.readLine() != null)
				lineCount++;

			System.out.println("The file has "+lineCount+" lines");
		}
		catch(IOException e) {
			System.err.println("Error while opening the file");
			e.printStackTrace();
		}
	}
}
