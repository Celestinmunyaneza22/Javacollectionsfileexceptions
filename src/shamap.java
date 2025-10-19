import java.util.HashMap;
public class shamap {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> grades = new HashMap<>();

        // Add key-value pairs
        grades.put("Alice", 90);
        grades.put("Bob", 85);
        grades.put("Charlie", 95);

        // Access a value using a key
        System.out.println("Alice's grade: " + grades.get("Alice"));

        // Loop through the map
        for (String name : grades.keySet()) {
            System.out.println(name + " => " + grades.get(name));
        }

        // Remove an entry
        grades.remove("Bob");

        System.out.println("After removal: " + grades);
    }
}
