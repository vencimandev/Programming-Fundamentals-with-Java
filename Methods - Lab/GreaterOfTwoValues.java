import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.next();
        String first = scanner.next();
        String second = scanner.next();
        System.out.println(getMax(type, first, second));

        scanner.close();
    }

    public static String getMax(String type, String first, String second) {
        switch (type) {
            case "int":
                return String.valueOf(Math.max(Integer.parseInt(first), Integer.parseInt(second)));
            case "char":
                return (first.charAt(0) > second.charAt(0)) ? first : second;
            case "string":
                return (first.compareTo(second) > 0) ? first : second;
            default:
                return "Invalid type";
        }
    }
}
