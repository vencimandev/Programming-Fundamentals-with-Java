import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = new Integer[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}