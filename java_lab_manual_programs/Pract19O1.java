interface Pet { public void test(); }
public class Pract19O1 implements Pet {
	public void test() {
		System.out.println("Interface Method Implemented");
	}
	public static void main(String[] args) {
		Pract19O1 pet = new Pract19O1();
		pet.test();
	}
	