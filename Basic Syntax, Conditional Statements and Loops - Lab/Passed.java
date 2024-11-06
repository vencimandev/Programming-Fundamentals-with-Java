import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входната оценка
        double grade = Double.parseDouble(scanner.nextLine());

        // Проверка и принтиране на "Passed!" ако оценката е >= 3.00
        if (grade >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
