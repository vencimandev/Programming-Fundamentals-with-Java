import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            numbers.add(Integer.parseInt(s));
        }

        String command;
        while (!(command = scanner.nextLine()).equals("end")) {
            String[] parts = command.split(" ");
            String action = parts[0];
            int number, index;

            switch (action) {
                case "Add":
                    number = Integer.parseInt(parts[1]);
                    numbers.add(number);
                    break;
                case "Remove":
                    number = Integer.parseInt(parts[1]);
                    numbers.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(parts[1]);
                    numbers.remove(index);
                    break;
                case "Insert":
                    number = Integer.parseInt(parts[1]);
                    index = Integer.parseInt(parts[2]);
                    numbers.add(index, number);
                    break;
            }
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
