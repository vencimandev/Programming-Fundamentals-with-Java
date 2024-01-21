import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] inputNumbers = scanner.nextLine().split(" ");
        for (String num : inputNumbers) {
            numbers.add(Integer.parseInt(num));
        }

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }

            String[] tokens = command.split(" ");
            String operation = tokens[0];

            if (operation.equals("Delete")) {
                int elementToDelete = Integer.parseInt(tokens[1]);
                numbers.removeAll(Arrays.asList(elementToDelete));
            } else if (operation.equals("Insert")) {
                int elementToInsert = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);

                if (position >= 0 && position < numbers.size()) {
                    numbers.add(position, elementToInsert);
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
