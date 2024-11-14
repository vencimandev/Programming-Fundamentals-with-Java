import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
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

            switch (action) {
                case "Contains":
                    int number = Integer.parseInt(parts[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (parts[1].equals("even")) {
                        printNumbers(numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
                    } else {
                        printNumbers(numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()));
                    }
                    break;
                case "Get":
                    System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
                    break;
                case "Filter":
                    printFilteredNumbers(numbers, parts[1], Integer.parseInt(parts[2]));
                    break;
            }
        }
    }

    private static void printNumbers(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printFilteredNumbers(List<Integer> numbers, String condition, int number) {
        List<Integer> filtered = new ArrayList<>();
        switch (condition) {
            case ">":
                filtered = numbers.stream().filter(n -> n > number).collect(Collectors.toList());
                break;
            case "<":
                filtered = numbers.stream().filter(n -> n < number).collect(Collectors.toList());
                break;
            case ">=":
                filtered = numbers.stream().filter(n -> n >= number).collect(Collectors.toList());
                break;
            case "<=":
                filtered = numbers.stream().filter(n -> n <= number).collect(Collectors.toList());
                break;
        }
        printNumbers(filtered);
    }
}
