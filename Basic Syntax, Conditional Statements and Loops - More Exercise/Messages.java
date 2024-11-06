import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine().trim();
            int mainDigit = Character.getNumericValue(input.charAt(0));
            int length = input.length();

            // Проверка за интервал (ако е '0')
            if (mainDigit == 0) {
                message.append(" ");
            } else {
                // Изчисляваме базовия ASCII индекс за дадената цифра
                int offset = (mainDigit - 2) * 3;
                if (mainDigit == 8 || mainDigit == 9) {
                    offset++;
                }

                // Намираме буквата и я добавяме в StringBuilder
                int letterIndex = offset + length - 1;
                char letter = (char) ('a' + letterIndex);
                message.append(letter);
            }
        }

        System.out.println(message.toString());
    }
}
