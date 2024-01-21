import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0); //"a".charAt(0) -> 'a'
        char secondSymbol = scanner.nextLine().charAt(0);

        printSymbolsInRange(firstSymbol, secondSymbol);
    }

    //метод, който отпечатва символите в даден диапазон
    public static void printSymbolsInRange (char firstSymbol, char secondSymbol) {
        //започваме от символа с по-малък аски код
        if (firstSymbol < secondSymbol) {
            for (char symbol = (char) (firstSymbol + 1); symbol < secondSymbol; symbol++) {
                System.out.print(symbol + " ");
            }

        } else {
            for (char symbol = (char) (secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}