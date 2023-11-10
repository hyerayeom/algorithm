import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            int[][] apart = new int[n + 1][k];

            for (int i = 0; i < k; i++) {
                apart[0][i] = i + 1;
            }

            for (int i = 1; i <= n; i++) { // 3 -> 1,2,3
                for (int j = 0; j < k; j++) {
                    if (j == 0) {
                        apart[i][j] = 1;
                    } else {
                        apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
                    }
                }
            }
            System.out.println(apart[n][k-1]);

        }

    }
}