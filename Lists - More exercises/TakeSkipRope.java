import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        List<Character> nonNumbers = new ArrayList<>();

        for (char c : message.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(Character.getNumericValue(c));
            } else {
                nonNumbers.add(c);
            }
        }

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }

        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = 0; i < takeList.size(); i++) {
            int takeCount = takeList.get(i);
            int skipCount = skipList.get(i);

            for (int j = 0; j < takeCount && index < nonNumbers.size(); j++) {
                result.append(nonNumbers.get(index++));
            }

            index += skipCount;
        }

        System.out.println(result.toString());
    }
}
