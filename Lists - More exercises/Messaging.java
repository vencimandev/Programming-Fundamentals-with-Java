import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numberStrings = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String number : numberStrings) {
            numbers.add(Integer.parseInt(number));
        }

        List<Character> text = new ArrayList<>();
        for (char c : scanner.nextLine().toCharArray()) {
            text.add(c);
        }

        StringBuilder result = new StringBuilder();

        for (int number : numbers) {
            int index = 0;
            while (number > 0) {
                index += number % 10;
                number /= 10;
            }
            index %= text.size();
            result.append(text.remove(index));
        }

        System.out.println(result.toString());
    }
}
