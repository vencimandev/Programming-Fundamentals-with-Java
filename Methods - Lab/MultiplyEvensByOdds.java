import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(multiplyEvensByOdds(number));

        scanner.close();
    }

    public static int multiplyEvensByOdds(int number) {
        int sumEvens = sumDigits(number, true);
        int sumOdds = sumDigits(number, false);
        return sumEvens * sumOdds;
    }

    public static int sumDigits(int number, boolean even) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if ((even && digit % 2 == 0) || (!even && digit % 2 != 0)) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
