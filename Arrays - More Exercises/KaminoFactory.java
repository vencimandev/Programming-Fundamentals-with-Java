import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());
        int[] bestDnaSequence = new int[dnaLength];
        int bestLength = 0;
        int bestIndex = Integer.MAX_VALUE;
        int bestSum = 0;
        int bestSampleIndex = 0;
        int sampleIndex = 0;

        String input;
        while (!(input = scanner.nextLine()).equals("Clone them!")) {
            sampleIndex++;
            String[] dnaStrings = input.split("!+");
            int[] dnaSequence = new int[dnaLength];
            for (int i = 0; i < dnaLength; i++) {
                dnaSequence[i] = Integer.parseInt(dnaStrings[i]);
            }

            int length = 0;
            int maxLength = 0;
            int startIndex = 0;
            int maxStartIndex = -1;
            int sum = 0;

            for (int i = 0; i < dnaLength; i++) {
                if (dnaSequence[i] == 1) {
                    length++;
                    if (length > maxLength) {
                        maxLength = length;
                        maxStartIndex = i - length + 1;
                    }
                } else {
                    length = 0;
                }
                sum += dnaSequence[i];
            }

            boolean isBetterDna = false;
            if (maxLength > bestLength) {
                isBetterDna = true;
            } else if (maxLength == bestLength) {
                if (maxStartIndex < bestIndex) {
                    isBetterDna = true;
                } else if (maxStartIndex == bestIndex && sum > bestSum) {
                    isBetterDna = true;
                }
            }

            if (isBetterDna) {
                bestDnaSequence = dnaSequence.clone();
                bestLength = maxLength;
                bestIndex = maxStartIndex;
                bestSum = sum;
                bestSampleIndex = sampleIndex;
            }
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSampleIndex, bestSum);
        for (int i : bestDnaSequence) {
            System.out.print(i + " ");
        }
    }
}
