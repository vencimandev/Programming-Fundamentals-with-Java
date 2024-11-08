import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isBalanced = true;
        boolean openBracketFound = false;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                if (openBracketFound) {
                    isBalanced = false;
                    break;
                }
                openBracketFound = true;
            } else if (input.equals(")")) {
                if (!openBracketFound) {
                    isBalanced = false;
                    break;
                }
                openBracketFound = false;
            }
        }

        if (isBalanced && !openBracketFound) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
