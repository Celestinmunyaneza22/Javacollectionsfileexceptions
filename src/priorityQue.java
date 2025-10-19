import java.util.PriorityQueue;
public class priorityQue {
    public static void main(String[] args) {
        // By default, smallest value has highest priority
        PriorityQueue<Integer> tasks = new PriorityQueue<>();

        tasks.add(3); // Low priority
        tasks.add(1); // High priority
        tasks.add(2); // Medium priority

        System.out.println("🚨 Processing tasks by priority:");
        while (!tasks.isEmpty()) {
            System.out.println("Processing task with priority: " + tasks.poll());
        }
    }
}
