import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            int number = Integer.parseInt(s);
            if (number >= 0) {
                numbers.add(number);
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }
}
