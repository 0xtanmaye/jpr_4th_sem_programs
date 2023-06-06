import java.io.*;
public class FileWriterProgram {
	public static void main(String[] args) throws Exception {
		String filename=args[0];
		FileWriter fw = new FileWriter(filename);
		int[] data = {65, 66, 67, 68, 69, 70};
		for(int i=0;i<data.length;i++) {
			fw.write(data[i]);
		}
		fw.close();
	}
}
				
