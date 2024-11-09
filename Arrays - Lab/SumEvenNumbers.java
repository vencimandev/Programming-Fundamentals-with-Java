import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int sum = 0;

        for (String numStr : input) {
            int number = Integer.parseInt(numStr);
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
