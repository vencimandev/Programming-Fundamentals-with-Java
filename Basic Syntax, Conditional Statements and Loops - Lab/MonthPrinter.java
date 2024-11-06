import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на номер на месец
        int month = Integer.parseInt(scanner.nextLine());

        // Месеците в масив
        String[] months = { "Error!", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Проверка за валидност и принтиране на месец
        if (month >= 1 && month <= 12) {
            System.out.println(months[month]);
        } else {
            System.out.println("Error!");
        }
    }
}
