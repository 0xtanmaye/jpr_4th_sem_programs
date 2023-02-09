import java.io.*;
import java.util.*;

public class VowelOrNot {
	public static void main(String[] args) throws Exception {
		String str;
		char ch;
		DataInputStream input = new DataInputStream(System.in);
		System.out.print("Enter a character:");
		str = input.readLine();
		ch = str.charAt(0);
		
		if(ch == 'a' || ch == 'A')
			System.out.println("The character is a vowel");
		else if(ch == 'e' || ch == 'E')
			System.out.println("The character is a vowel");
		else if(ch == 'i' || ch == 'I')
			System.out.println("The character is a vowel");
		else if(ch == 'o' || ch == 'O')
			System.out.println("The character is a vowel");
		else if(ch == 'u' || ch == 'U')
			System.out.println("The character is a vowel");
		else
			System.out.println("The character is a consonant");
	}
}
		