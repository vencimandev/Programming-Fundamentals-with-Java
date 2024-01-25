import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            }

            else {
                int currentCount = symbolsCount.get(symbol); //текущ бр. срещания
                symbolsCount.put(symbol, currentCount + 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            //entry -> всеки един запис
            //entry.getKey() -> символ
            //entry.getValue() -> бр. срещания
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}