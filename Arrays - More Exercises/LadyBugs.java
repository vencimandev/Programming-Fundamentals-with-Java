import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] field = new int[size];
        String[] initialIndexes = scanner.nextLine().split(" ");

        for (String index : initialIndexes) {
            int ladybugIndex = Integer.parseInt(index);
            if (ladybugIndex >= 0 && ladybugIndex < size) {
                field[ladybugIndex] = 1;
            }
        }

        String command;
        while (!(command = scanner.nextLine()).equals("end")) {
            String[] tokens = command.split(" ");
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (index < 0 || index >= size || field[index] == 0) {
                continue;
            }

            field[index] = 0;
            while (true) {
                if (direction.equals("right")) {
                    index += flyLength;
                } else if (direction.equals("left")) {
                    index -= flyLength;
                }

                if (index < 0 || index >= size) {
                    break;
                }
                if (field[index] == 0) {
                    field[index] = 1;
                    break;
                }
            }
        }

        for (int cell : field) {
            System.out.print(cell + " ");
        }
    }
}
