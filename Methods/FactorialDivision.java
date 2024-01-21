import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long factFirstNumber = calculateFactorial(firstNumber);

        long factSecondNumber = calculateFactorial(secondNumber);

        double result = factFirstNumber * 1.0 / factSecondNumber;
        System.out.printf("%.2f", result);
    }

    //метод, който връща резултат (факториел на даденото число)
    public static long calculateFactorial (int number) {
        //number = 8
        //8! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8
        long fact = 1; //стойността на факториел
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }

        return fact;
    }
}