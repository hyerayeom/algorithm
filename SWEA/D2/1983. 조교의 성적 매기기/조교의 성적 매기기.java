import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        int T = Integer.parseInt(br.readLine());
        String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            ArrayList<Integer> A = new ArrayList<>();
            Double[] answer = new Double[N];
            answer[0] = 0.0;
            double Kscore = 0.0;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                double a = Integer.parseInt(st.nextToken());
                double b = Integer.parseInt(st.nextToken());
                double c = Integer.parseInt(st.nextToken());
                double sum = a * 0.35 + b * 0.45 + c * 0.20;
                answer[i] = sum;
                if (i+1 == K) {
                    Kscore = sum;
                }

            }

            Arrays.sort(answer, Collections.reverseOrder());

            int cutLine = N / 10;
            int th = 0;
            for (int i = 0; i < N; i++) {
                if (answer[i] == Kscore) {
                    th = i+1;
                    break;
                }
            }

            if(th%cutLine != 0) {
                th = th/cutLine + 1;
            } else {
                th /= cutLine;
            }

            sb.append("#" + test_case + " " + score[th-1] + "\n");
        } // test_case END
        System.out.println(sb);
    } // main END

} // END



