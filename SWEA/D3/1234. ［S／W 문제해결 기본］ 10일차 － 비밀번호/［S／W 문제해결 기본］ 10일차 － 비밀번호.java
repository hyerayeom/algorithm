import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = 10; //
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            StringBuffer inputS = new StringBuffer(st.nextToken());

            loop:
            while (true) {
                for(int i=0; i<inputS.length()-1; i++) {
                    if(inputS.charAt(i) == inputS.charAt(i+1)) {
                        inputS.deleteCharAt(i+1);
                        inputS.deleteCharAt(i);
                        break;
                    } else if(i == inputS.length()-2) {
                        break loop;
                    }
                }
            }

            sb.append("#" + test_case + " " + inputS + "\n");
        } // test_case END
        System.out.println(sb);
    } // main END

} // END

