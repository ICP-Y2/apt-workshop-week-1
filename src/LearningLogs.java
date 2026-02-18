import java.util.ArrayList;
import java.util.Scanner;

public class LearningLogs {

    private static Scanner scanner = new Scanner(System.in);

    // TODO: Store all topics here
    

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // TODO: Add topic
                    break;
                case "2":
                    // TODO: View topics
                    break;
                case "3":
                    // TODO: Add entry to a topic
                    break;
                case "4":
                    // TODO: View entries
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nLearning Logs Menu");
        System.out.println("1. Add Topic");
        System.out.println("2. View Topics");
        System.out.println("3. Add Entry");
        System.out.println("4. View Entries");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    // TODO: Implement add topic logic

    // TODO: Implement view topics logic

    // TODO: Implement add entry logic

    // TODO: Implement view entries logic
}
