import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        String[] drumQualityStrings = scanner.nextLine().split("\\s+");
        List<Integer> initialQualities = new ArrayList<>();
        List<Integer> currentQualities = new ArrayList<>();

        for (String quality : drumQualityStrings) {
            int drumQuality = Integer.parseInt(quality);
            initialQualities.add(drumQuality);
            currentQualities.add(drumQuality);
        }

        String command = scanner.nextLine();
        while (!command.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(command);

            for (int i = 0; i < currentQualities.size(); i++) {
                currentQualities.set(i, currentQualities.get(i) - hitPower);

                if (currentQualities.get(i) <= 0) {
                    int replacementCost = initialQualities.get(i) * 3;
                    if (savings >= replacementCost) {
                        savings -= replacementCost;
                        currentQualities.set(i, initialQualities.get(i));
                    } else {
                        currentQualities.remove(i);
                        initialQualities.remove(i);
                        i--;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int quality : currentQualities) {
            System.out.print(quality + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.%n", savings);
    }
}
