import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int j = 0; j < n; j++) {
                numbers[j] = scanner.nextInt();
            }

            ArvoreBinariaBusca  bst = new ArvoreBinariaBusca();
            for (int number : numbers) {
                bst.insert(number);
            }

            bst.printPaths(i);
        }
    }
}