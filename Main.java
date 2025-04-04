import java.util.Scanner;

// Main class for user input
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardGame game = new CardGame();

        System.out.print("Enter a number between 1 and 52 to pick a card: ");
        int choice = scanner.nextInt();

        Card pickedCard = game.pickCard(choice);

        if (pickedCard != null) {
            System.out.println("You picked: " + pickedCard);
        } else {
            System.out.println("Invalid choice! Please pick a number between 1 and 52.");
        }

        scanner.close();
    }
}
