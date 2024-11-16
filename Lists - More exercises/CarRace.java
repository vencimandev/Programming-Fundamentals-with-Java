import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] raceTimes = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            raceTimes[i] = Integer.parseInt(input[i]);
        }

        int midIndex = raceTimes.length / 2;
        double leftTime = 0, rightTime = 0;

        for (int i = 0; i < midIndex; i++) {
            leftTime += raceTimes[i];
            if (raceTimes[i] == 0) {
                leftTime *= 0.8;
            }
        }

        for (int i = raceTimes.length - 1; i > midIndex; i--) {
            rightTime += raceTimes[i];
            if (raceTimes[i] == 0) {
                rightTime *= 0.8;
            }
        }

        if (leftTime < rightTime) {
            System.out.printf("The winner is left with total time: %.1f%n", leftTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f%n", rightTime);
        }
    }
}
