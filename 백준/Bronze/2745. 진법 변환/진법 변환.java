import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int answer = 0;
        for (int i = 0; i < N.length(); i++) {
            char C = N.charAt(i);
            int a;
            if (C >= 65 && C <= 90) {
                a = C - 55;
            } else {
                a = Character.getNumericValue(C);
            }
            answer += a * (int)Math.pow(B, N.length() - i - 1);
        }
        System.out.println(answer);
    }
}