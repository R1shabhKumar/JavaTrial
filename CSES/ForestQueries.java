import java.util.Scanner;

public class ForestQueries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                if (line.charAt(j) == '*') {
                    grid[i][j] = 1;
                } else {
                    grid[i][j] = 0;
                }
            }
        }
        int[][] prefix = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = grid[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }
        for (int k = 0; k < q; k++) {
            int y1 = scanner.nextInt();
            int x1 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int treesInRectangle = prefix[y2][x2]
                    - prefix[y1 - 1][x2]
                    - prefix[y2][x1 - 1]
                    + prefix[y1 - 1][x1 - 1];
            System.out.println(treesInRectangle);
        }
        scanner.close();
    }
}
