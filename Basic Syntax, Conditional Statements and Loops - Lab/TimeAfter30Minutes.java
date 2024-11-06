import java.util.Scanner;

public class TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на часа и минутите
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        // Добавяне на 30 минути
        minutes += 30;

        // Проверка дали минутите надвишават 59
        if (minutes > 59) {
            hours += 1;
            minutes -= 60;
        }

        // Проверка дали часовете надвишават 23
        if (hours > 23) {
            hours = 0;
        }

        // Принтиране на резултата с водеща нула за минутите
        System.out.printf("%d:%02d%n", hours, minutes);
    }
}
