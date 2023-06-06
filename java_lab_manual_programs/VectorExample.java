import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        // Adding elements to the vector
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        v.add("Durian");

        // Inserting an element at a specific index
        v.add(1, "Grape");

        // Displaying the elements using for-each loop
        for (String fruit : v) {
            System.out.println(fruit);
        }
    }
}
