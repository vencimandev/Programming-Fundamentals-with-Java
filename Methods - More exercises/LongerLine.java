import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        printLongerLine(x1, y1, x2, y2, x3, y3, x4, y4);

        scanner.close();
    }

    public static double calculateDistance(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static double getLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void printLongerLine(double x1, double y1, double x2, double y2,
                                       double x3, double y3, double x4, double y4) {
        double line1Length = getLineLength(x1, y1, x2, y2);
        double line2Length = getLineLength(x3, y3, x4, y4);

        if (line1Length >= line2Length) {
            printPointsInOrder(x1, y1, x2, y2);
        } else {
            printPointsInOrder(x3, y3, x4, y4);
        }
    }

    public static void printPointsInOrder(double x1, double y1, double x2, double y2) {
        if (calculateDistance(x1, y1) <= calculateDistance(x2, y2)) {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)%n", x1, y1, x2, y2);
        } else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)%n", x2, y2, x1, y1);
        }
    }
}
