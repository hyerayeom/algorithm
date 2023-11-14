import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        String answer = "";
        for (int test_case = 1; test_case <= T; test_case++) {
            System.out.println("#"+test_case);

            int N =  Integer.parseInt(br.readLine());
            for(int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                String inputS = st.nextToken();
                int inputN = Integer.parseInt(st.nextToken());

                for(int j =0; j<inputN; j++) {
                    answer += inputS;
                    if(answer.length() == 10) {
                        System.out.println(answer);
                        answer = "";
                    }
                }
            }
            if(answer.length() != 0) {
                System.out.println(answer);
            }
            answer = "";

//            sb.append("#" + test_case + " " + "\n");
        } // test_case END
//        System.out.println(sb);
    } // main END

} // END
