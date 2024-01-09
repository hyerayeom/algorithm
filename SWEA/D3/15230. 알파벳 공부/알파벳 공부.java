import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            int alphabet = 97;
            String S = br.readLine();
            int answer =  S.length();
            for (int i = 0; i < S.length(); i++) {
                if (alphabet != S.charAt(i)) {
                    answer -= answer-i;
                    break;
                }
                alphabet++;
            }
            sb.append("#" + test_case + " " + answer + "\n");
        }
        System.out.println(sb);
    }
}