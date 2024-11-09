import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long[][] triangle = new long[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new long[i + 1];
            triangle[i][0] = triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            for (long num : triangle[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
