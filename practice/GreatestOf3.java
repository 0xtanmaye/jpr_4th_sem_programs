import java.io.*;
import java.util.*;

public class GreatestOf3 {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        DataInputStream input = new DataInputStream(System.in);
        System.out.println("Enter three numbers:");
        a=Integer.parseInt(input.readLine());
        b=Integer.parseInt(input.readLine());
        c=Integer.parseInt(input.readLine());

        if(a>b) {
            if(a>c) {
                System.out.println("A is the Greatest");
            }
            else {
                System.out.println("C is the Greatest");   
            }
        }
	else {
	    if(b>c) {
                System.out.println("B is the Greatest");
            }
            else {
                System.out.println("C is the Greatest");   
            }
	}
    }
}