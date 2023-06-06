public class FunctionOverloadingExample {
	public static void main(String[] args) {
		float sum = add(2, 2.1f);
	}
	public static float add(float a, int b) {
		System.out.println("This is method 1");
		return a+b;
	}
	public static float add(int a, float b) {	
		System.out.println("This is method 2");
		return a+b;
	}
}
