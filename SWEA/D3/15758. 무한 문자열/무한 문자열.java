import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            String answer = "";

            if(A.length() == B.length()) {
                if(A.equals(B)) {
                    answer = "yes";
                    sb.append("#" + test_case + " " + answer + "\n");
                    continue;
                }
            }

            if(A.length() > B.length()) {
                A+=A;
                while (B.length() <= A.length()) {
                    B += B;
                }
                String temp = B.substring(0, A.length());
//                System.out.println("A = " + A);
//                System.out.println("temp = " + temp);

                if(A.equals(temp)) {
                    answer = "yes";
                    sb.append("#" + test_case + " " + answer + "\n");
                    continue;
                }
            } else {
                B+=B;
                while (B.length() >= A.length()) {
                    A += A;
                }
                String temp = A.substring(0, B.length());
//                System.out.println("temp = " + temp);
//                System.out.println("B = " + B);

                if (B.equals(temp)) {
                    answer = "yes";
                    sb.append("#" + test_case + " " + answer + "\n");
                    continue;
                }
            }

            answer = "no";
            sb.append("#" + test_case + " " + answer + "\n");

        } // test_case END
        System.out.println(sb);
    } // main END

} // END