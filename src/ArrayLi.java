import java.util.ArrayList;
public class ArrayLi {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // Loop through elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
    }
}
