import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        printCountVowels(text);
    }

    //метод, който принтира брой на гласните букви в даден текст
    public static void printCountVowels (String text) {
        int count = 0; //брой на гласните букви
        for (char letter : text.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                    || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                count++;
            }
        }

        System.out.println(count);
    }
}