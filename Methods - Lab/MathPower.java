import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println(mathPower(base, power));

        scanner.close();
    }

    public static int mathPower(int base, int power) {
        return (int) Math.pow(base, power);
    }
}
