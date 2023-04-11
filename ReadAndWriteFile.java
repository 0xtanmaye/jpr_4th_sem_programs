import java.io.*;

public class ReadAndWriteFile {
	public static void main(String[] args) {
	
		try {
			RandomAccessFile couf = new RandomAccessFile("country.txt", "rw");
			RandomAccessFile capf = new RandomAccessFile("capital.txt", "rw");
			
			couf.writeBytes("India\n");
			couf.writeBytes("USA\n");
			couf.writeBytes("France\n");
			couf.writeBytes("Brazil\n");
			couf.writeBytes("Japan\n");

			capf.writeBytes("Delhi\n");
			capf.writeBytes("New York\n");
			capf.writeBytes("Paris\n");
			capf.writeBytes("Brasillia\n");
			capf.writeBytes("Tokyo\n");

			int seeksize;
			
			seeksize=getLineCharCount(couf, 4);
			couf.seek(seeksize);

			System.out.println(seeksize+"\n");
			String temp1=couf.readLine();
			seeksize=getLineCharCount(capf, 4);
			capf.seek(seeksize);
			String temp2=capf.readLine();

			System.out.println(temp1+"\n"+temp2);
		}
		catch(Exception e)
		{
		}
	}
	static int getLineCharCount(RandomAccessFile rf, int line)
	{
		int count=0;
		try {
		rf.seek(0);
		for(int i=0;i<line;i++)
		{
			while(((char)rf.readByte())!='\n')
				count++;
		}
		}
		catch(Exception e)
		{
		}
		return count;
	}
}

