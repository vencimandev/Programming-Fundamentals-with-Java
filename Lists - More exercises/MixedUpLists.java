import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split("\\s+");
        String[] secondInput = scanner.nextLine().split("\\s+");

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (String s : firstInput) {
            list1.add(Integer.parseInt(s));
        }
        for (String s : secondInput) {
            list2.add(Integer.parseInt(s));
        }

        List<Integer> mixedList = new ArrayList<>();
        while (!list1.isEmpty() && !list2.isEmpty()) {
            mixedList.add(list1.remove(0));
            mixedList.add(list2.remove(list2.size() - 1));
        }

        List<Integer> range = list1.isEmpty() ? list2 : list1;
        int lowerBound = Math.min(range.get(0), range.get(1));
        int upperBound = Math.max(range.get(0), range.get(1));

        List<Integer> result = new ArrayList<>();
        for (int num : mixedList) {
            if (num > lowerBound && num < upperBound) {
                result.add(num);
            }
        }

        Collections.sort(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
