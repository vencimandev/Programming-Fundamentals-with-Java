import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int length = scanner.nextInt();
        System.out.println(calculateRectangleArea(width, length));

        scanner.close();
    }

    public static int calculateRectangleArea(int width, int length) {
        return width * length;
    }
}
