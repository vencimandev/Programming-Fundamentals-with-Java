import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.next();
        int quantity = scanner.nextInt();
        calculateTotalPrice(product, quantity);

        scanner.close();
    }

    public static void calculateTotalPrice(String product, int quantity) {
        double price;
        switch (product) {
            case "coffee": price = 1.50; break;
            case "water": price = 1.00; break;
            case "coke": price = 1.40; break;
            case "snacks": price = 2.00; break;
            default: price = 0;
        }
        System.out.printf("%.2f%n", price * quantity);
    }
}
