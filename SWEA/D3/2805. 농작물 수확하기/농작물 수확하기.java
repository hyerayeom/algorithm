import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            // 밭 가치 입력
            int[][] map = new int[N][N];
            for (int i = 0; i < N; i++) {
                String input = br.readLine();
                for (int j = 0; j < N; j++) {
                    map[i][j] = Character.getNumericValue(input.charAt(j));
                }
            }

            ArrayList<Integer> J = new ArrayList<>();
            J.add(N / 2);
            int answer = 0;
            for (int i = 0; i < N / 2 + 1; i++) {
//                System.out.println("J" + J);
                for (int j = 0; j < J.size(); j++) {
                    int a = J.get(j);

                    if (i == N / 2) {
                        answer += map[i][a];
                    } else {
                        answer += map[i][a] + map[N - (i + 1)][a];
                    }
                }
                if (i != N / 2) {
                    J.add(J.get(J.size() - 1) + 1);
                    J.add(J.get(0) - 1);
                    Collections.sort(J);
                }
            }
            sb.append("#" + test_case + " " + answer + "\n");
        } // test_case END
        System.out.println(sb);
    } // main END

} // END

