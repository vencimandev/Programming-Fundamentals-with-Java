import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        List<Integer> lis = findLIS(nums);
        for (int num : lis) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> findLIS(int[] nums) {
        int[] len = new int[nums.length];
        int[] prev = new int[nums.length];
        int maxLength = 0;
        int endIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            len[i] = 1;
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && len[j] + 1 > len[i]) {
                    len[i] = len[j] + 1;
                    prev[i] = j;
                }
            }
            if (len[i] > maxLength) {
                maxLength = len[i];
                endIndex = i;
            }
        }

        List<Integer> lis = new ArrayList<>();
        while (endIndex != -1) {
            lis.add(0, nums[endIndex]);
            endIndex = prev[endIndex];
        }
        return lis;
    }
}
