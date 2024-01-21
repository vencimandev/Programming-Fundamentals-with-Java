import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialWagonData = scanner.nextLine().split(" ");
        List<Integer> wagons = new ArrayList<>();
        for (String wagon : initialWagonData) {
            wagons.add(Integer.parseInt(wagon));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Add")) {
                int passengersToAdd = Integer.parseInt(tokens[1]);
                wagons.add(passengersToAdd);
            } else {
                int passengersToInsert = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengersToInsert <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + passengersToInsert);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        scanner.close();

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
