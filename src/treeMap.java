import java.util.TreeMap;
public class treeMap {
    public static void main(String[] args) {
        // TreeMap sorts keys (student IDs) in ascending order
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(102, "Bob");
        students.put(101, "Alice");
        students.put(105, "Eve");
        students.put(103, "Charlie");

        // Entries are automatically sorted by keys
        System.out.println("📋 Sorted Student Records:");
        for (int id : students.keySet()) {
            System.out.println("ID: " + id + " → " + students.get(id));
        }

        // Get first and last entry
        System.out.println("\n🔍 First student: " + students.firstEntry());
        System.out.println("🔍 Last student: " + students.lastEntry());
    }
}
