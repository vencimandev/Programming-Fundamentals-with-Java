import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            numbers.add(Integer.parseInt(s));
        }

        List<Integer> result = new ArrayList<>();
        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            result.add(numbers.get(i) + numbers.get(size - 1 - i));
        }
        if (size % 2 != 0) {
            result.add(numbers.get(size / 2));
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
