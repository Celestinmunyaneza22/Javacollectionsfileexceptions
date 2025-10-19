import java.util.Stack;
public class stack1 {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        // Visit pages
        history.push("Home");
        history.push("About");
        history.push("Services");
        history.push("Contact");

        System.out.println("🧭 Current page: " + history.peek());

        // Go back
        System.out.println("↩️ Going back from: " + history.pop());
        System.out.println("📄 Now on page: " + history.peek());
    }
}
