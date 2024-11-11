import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        System.out.printf("%d%n", calculate(num1, operator, num2));

        scanner.close();
    }

    public static int calculate(int num1, char operator, int num2) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }
}
