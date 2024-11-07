import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int number = i;

            // Изчисляваме сумата на цифрите на текущото число
            while (number > 0) {
                sumOfDigits += number % 10;
                number /= 10;
            }

            // Проверяваме дали сумата отговаря на условието за специално число
            boolean isSpecial = (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11);

            // Извеждаме резултата с главни букви за True/False
            System.out.printf("%d -> %s%n", i, String.valueOf(isSpecial).substring(0, 1).toUpperCase() + String.valueOf(isSpecial).substring(1));
        }
    }
}
