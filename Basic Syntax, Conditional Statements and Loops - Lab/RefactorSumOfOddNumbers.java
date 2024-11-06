import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1, count = 0; count < n; i += 2, count++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}
