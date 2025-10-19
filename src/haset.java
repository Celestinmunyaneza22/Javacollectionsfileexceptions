import java.util.HashSet;
public class haset {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        // Add items (duplicates are automatically ignored)
        emails.add("user1@example.com");
        emails.add("user2@example.com");
        emails.add("user1@example.com");  // Duplicate

        // Display the set
        System.out.println("Unique Emails:");
        for (String email : emails) {
            System.out.println(email);
        }

        // Check if an email exists
        if (emails.contains("user2@example.com")) {
            System.out.println("Email found.");
        }
    }
}
