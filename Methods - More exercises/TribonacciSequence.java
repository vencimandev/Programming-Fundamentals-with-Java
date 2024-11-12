import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printTribonacciSequence(num);
        scanner.close();
    }

    public static void printTribonacciSequence(int num) {
        if (num >= 1) System.out.print("1 ");
        if (num >= 2) System.out.print("1 ");
        if (num >= 3) System.out.print("2 ");

        long first = 1, second = 1, third = 2;
        for (int i = 4; i <= num; i++) {
            long next = first + second + third;
            System.out.print(next + " ");
            first = second;
            second = third;
            third = next;
        }
    }
}
