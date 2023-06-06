import java.util.Vector;
class VectorExample {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("apple"); vector.add("banana"); vector.add("orange");
		for (String element : vector) System.out.println(element);

		System.out.println("Size: " + vector.size());
		System.out.println("Capacity: " + vector.capacity());

		vector.add(1, "grape");

		System.out.println("Updated elements:");
		for (String element : vector) System.out.println(element);

		System.out.println("Contains 'banana'? " + vector.contains("banana"));
		System.out.println("Element at index 2: " + vector.get(2));

		vector.remove(0);

		System.out.println("Updated elements:");
		for (String element : vector) System.out.println(element);

		vector.clear();

		System.out.println("Size after clear: " + vector.size());
		System.out.println("Capacity after clear: " + vector.capacity());
	}
}
