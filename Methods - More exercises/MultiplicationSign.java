import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        printSignOfProduct(num1, num2, num3);

        scanner.close();
    }

    public static void printSignOfProduct(int num1, int num2, int num3) {
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if ((num1 < 0 && num2 > 0 && num3 > 0) ||
                (num1 > 0 && num2 < 0 && num3 > 0) ||
                (num1 > 0 && num2 > 0 && num3 < 0) ||
                (num1 < 0 && num2 < 0 && num3 < 0)) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}
