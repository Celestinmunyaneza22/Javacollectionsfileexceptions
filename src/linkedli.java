import java.util.LinkedList;
public class linkedli {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        // Add tasks (FIFO style)
        tasks.add("Email client");
        tasks.add("Write report");
        tasks.addFirst("Check inbox");   // Insert at beginning
        tasks.addLast("Log out");        // Insert at end

        // Display all tasks
        System.out.println("Task Queue:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Remove first task (processed)
        System.out.println("\nProcessing: " + tasks.removeFirst());

        System.out.println("Remaining tasks: " + tasks);
    }
}
