import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на оценката
        double grade = Double.parseDouble(scanner.nextLine());

        // Проверка за резултата
        if (grade >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}

