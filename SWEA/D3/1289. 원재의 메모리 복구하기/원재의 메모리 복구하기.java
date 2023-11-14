import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            StringBuffer input = new StringBuffer(br.readLine());
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '1') {
                    count++;
                    for (int j = i; j < input.length(); j++) {
                        if (input.charAt(j) == '1') {
                            input.insert(j, "0");
                        } else {
                            input.insert(j, "1");
                        }
                        input.deleteCharAt(j + 1);
                    }
                }
            }
            sb.append("#" + test_case + " " + count + "\n");
        } // test_case END
        System.out.println(sb);
    } // main END

} // END
