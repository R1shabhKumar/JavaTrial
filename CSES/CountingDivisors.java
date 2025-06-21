import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CountingDivisors {

    private static final int MAX_X = 1000000;
    private static int[] divisorsCount;

    public static void precomputeDivisors() {
        divisorsCount = new int[MAX_X + 1];

        for (int i = 1; i <= MAX_X; i++) {
            for (int j = i; j <= MAX_X; j += i) {
                divisorsCount[j]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        precomputeDivisors();

        int n = Integer.parseInt(br.readLine());

        for (int k = 0; k < n; k++) {
            int x = Integer.parseInt(br.readLine());
            pw.println(divisorsCount[x]);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}