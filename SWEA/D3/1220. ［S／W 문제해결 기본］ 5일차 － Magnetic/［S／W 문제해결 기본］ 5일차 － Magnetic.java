import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = 10; // 10
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 0 = 공백, 1 = N극, 2 = S극

            int count = 0;
            for (int i = 0; i < N; i++) {
                String temp = "";
                for (int j = 0; j < N; j++) {
                    if (map[j][i] == 1 || map[j][i] == 2) {
                        temp += map[j][i];
                    }
                }

//                System.out.println("temp = "+temp);
                if(temp.length() == 1 || temp.isEmpty()) {
//                    System.out.println("NO");
                    continue;
                }

                for (int j = 0; j < temp.length() - 1; j++) {
                    String slice = temp.substring(j, j+2);
//                    System.out.println(slice);
                    if(slice.equals("12")) {
                        count++;
//                        System.out.println("count = " + count);
                    }
                }
            }

            sb.append("#" + test_case + " " + count + "\n");
        } // test_case END
        System.out.println(sb);
    } // main END

} // END
