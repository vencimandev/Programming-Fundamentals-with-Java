import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double totalSpent = 0;
        String game;

        while (!(game = scanner.nextLine()).equals("Game Time")) {
            double price = getGamePrice(game);

            if (price == -1) {
                System.out.println("Not Found");
            } else if (price > balance) {
                System.out.println("Too Expensive");
            } else {
                balance -= price;
                totalSpent += price;
                System.out.println("Bought " + game);

                if (balance == 0) {
                    System.out.println("Out of money!");
                    return;
                }
            }
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", totalSpent, balance);
    }

    public static double getGamePrice(String game) {
        switch (game) {
            case "OutFall 4": return 39.99;
            case "CS: OG": return 15.99;
            case "Zplinter Zell": return 19.99;
            case "Honored 2": return 59.99;
            case "RoverWatch": return 29.99;
            case "RoverWatch Origins Edition": return 39.99;
            default: return -1;
        }
    }
}
