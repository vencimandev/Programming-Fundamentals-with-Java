import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = Integer.parseInt(scanner.nextLine());

        for (int number = 2; number <= range; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.printf("%d -> %b%n", number, isPrime);
        }
    }
}
