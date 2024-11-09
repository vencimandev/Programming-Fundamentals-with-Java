import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] encryptedValues = new int[n];

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            int encryptedValue = 0;
            for (char ch : word.toCharArray()) {
                if ("AEIOUaeiou".indexOf(ch) >= 0) {
                    encryptedValue += ch * word.length();
                } else {
                    encryptedValue += ch / word.length();
                }
            }
            encryptedValues[i] = encryptedValue;
        }

        Arrays.sort(encryptedValues);

        for (int value : encryptedValues) {
            System.out.println(value);
        }
    }
}
