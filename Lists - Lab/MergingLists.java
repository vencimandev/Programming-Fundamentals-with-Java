import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = readList(scanner);
        List<Integer> secondList = readList(scanner);

        List<Integer> result = new ArrayList<>();
        int maxLength = Math.max(firstList.size(), secondList.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < firstList.size()) result.add(firstList.get(i));
            if (i < secondList.size()) result.add(secondList.get(i));
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> readList(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }
}
