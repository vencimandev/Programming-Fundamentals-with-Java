import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println(getClosestPoint(x1, y1, x2, y2));

        scanner.close();
    }

    public static String getClosestPoint(double x1, double y1, double x2, double y2) {
        double distance1 = calculateDistance(x1, y1);
        double distance2 = calculateDistance(x2, y2);

        if (distance1 <= distance2) {
            return String.format("(%.0f, %.0f)", x1, y1);
        } else {
            return String.format("(%.0f, %.0f)", x2, y2);
        }
    }

    public static double calculateDistance(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
}
