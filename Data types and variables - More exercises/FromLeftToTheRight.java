import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            long left = Long.parseLong(numbers[0]);
            long right = Long.parseLong(numbers[1]);

            long numberToSum = Math.max(left, right);
            long sum = 0;

            while (numberToSum != 0) {
                sum += Math.abs(numberToSum % 10);
                numberToSum /= 10;
            }

            System.out.println(sum);
        }
    }
}
