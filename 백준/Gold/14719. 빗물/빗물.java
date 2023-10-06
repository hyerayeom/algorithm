import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] valley = new int[N][M];
        int answer = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) { // M=8
            int n = Integer.parseInt(st.nextToken());
            for (int j = N - 1; j > (N - 1) - n; j--) {
                valley[j][i] = 1;
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            boolean block = false;
            int count = 0;

            for (int j = 0; j < M; j++) {
                if (valley[i][j] == 1 && count == 0) { // 블록 시작
                    block = true;
                    continue;
                } else if (valley[i][j] == 1 && count > 0) { // 블록 끝
                    answer += count;
                    count = 0;
                    continue;
                }

                if (block && valley[i][j] == 0) {
                    count++;
                }

            }
        }
        System.out.println(answer);
    }
}