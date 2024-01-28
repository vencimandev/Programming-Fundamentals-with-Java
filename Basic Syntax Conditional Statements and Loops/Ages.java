import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        String category = determineAgeCategory(age);

        System.out.println(category);
    }

    private static String determineAgeCategory(int age) {
        if (age >= 0 && age <= 2) {
            return "baby";
        } else if (age >= 3 && age <= 13) {
            return "child";
        } else if (age >= 14 && age <= 19) {
            return "teenager";
        } else if (age >= 20 && age <= 65) {
            return "adult";
        } else {
            return "elder";
        }
    }
}
