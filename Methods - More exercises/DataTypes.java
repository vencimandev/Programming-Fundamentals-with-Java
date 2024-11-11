import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.next();
        if (dataType.equals("int")) {
            int number = scanner.nextInt();
            processInput(number);
        } else if (dataType.equals("real")) {
            double number = scanner.nextDouble();
            processInput(number);
        } else if (dataType.equals("string")) {
            String text = scanner.next();
            processInput(text);
        }

        scanner.close();
    }

    public static void processInput(int number) {
        System.out.println(number * 2);
    }

    public static void processInput(double number) {
        System.out.printf("%.2f%n", number * 1.5);
    }

    public static void processInput(String text) {
        System.out.println("$" + text + "$");
    }
}
