import java.util.*;
public class EvenOrOddExample {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
		int num = s.nextInt();

        if (num % 2 == 0) 
            System.out.println(num + " is even");
		else
            System.out.println(num + " is odd");
    }
}