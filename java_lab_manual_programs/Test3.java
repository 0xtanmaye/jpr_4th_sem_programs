interface FamousLine {
	void ShowLine() {
		System.out.println("Show Line");
	}
}

class Sample implements FamousLine {
}

public class Test3 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.ShowLine();
	}
}