import java.io.*;
public class FileOStream {
	public static void main(String[] args) throws Exception {
		File f = new File("test");
		f.createNewFile();
		int t=-2147483647;
		FileOutputStream fo = new FileOutputStream(f);
		DataOutputStream doo = new DataOutputStream(fo);
		doo.writeInt(t);
		//byte[] str = {'h','e','l'};
		//fo.write(t);
		fo.close();
	}
}
