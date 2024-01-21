import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index]; //текущото число
            //обхождам всички след него
            for (int i = index + 1; i <= numbers.length - 1; i++) { //всички числа след моето
                int nextNumber = numbers[i]; //число, след моето
                //currentNumber       nextNumber
                if (currentNumber + nextNumber == magicSum) {
                    System.out.println(currentNumber + " " + nextNumber);
                }

            }

        }

    }
}