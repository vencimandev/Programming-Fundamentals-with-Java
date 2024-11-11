import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        calculate(operation, a, b);

        scanner.close();
    }

    public static void calculate(String command, int a, int b) {
        switch (command) {
            case "add":
                System.out.println(a + b);
                break;
            case "multiply":
                System.out.println(a * b);
                break;
            case "subtract":
                System.out.println(a - b);
                break;
            case "divide":
                System.out.println(a / b);
                break;
        }
    }
}
