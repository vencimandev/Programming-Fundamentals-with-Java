import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacter(text);

    }

    //метод, който принтира средния символ
    public static void printMiddleCharacter (String text) {
        int length = text.length();

        if (length % 2 != 0) {

            int indexOfMiddleCharacter = length / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
        else {
            int indexFirstMiddleCharacter = length / 2 - 1;
            int indexSecondMiddleCharacter = length / 2;
            System.out.print(text.charAt(indexFirstMiddleCharacter));
            System.out.print(text.charAt(indexSecondMiddleCharacter));
        }
    }

}