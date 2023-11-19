import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int min = 101;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            int score = Integer.parseInt(st.nextToken());
            sum += score;
            if (score < min) {
                min = score;
                index = i;
            }
        }
        String answer = "OK";

        if (sum >= 100) {
            sb.append(answer);
        } else {
            switch (index) {
                case 0:
                    answer = "Soongsil";
                    break;
                case 1:
                    answer = "Korea";
                    break;
                case 2:
                    answer = "Hanyang";
                    break;
            }
            sb.append(answer);
        }
        System.out.println(sb);
    }
}