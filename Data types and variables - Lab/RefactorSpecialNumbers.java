import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1; currentNumber <= maxNumber; currentNumber++) {
            int sumOfDigits = 0;
            int number = currentNumber;

            // Изчисляваме сумата на цифрите на текущото число
            while (number > 0) {
                sumOfDigits += number % 10;
                number /= 10;
            }

            // Проверяваме дали числото е специално
            boolean isSpecial = (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11);

            // Извеждаме резултата със главна буква за булевата стойност
            System.out.printf("%d -> %s%n", currentNumber, isSpecial ? "True" : "False");
        }
    }
}
