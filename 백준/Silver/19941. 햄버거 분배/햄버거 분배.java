import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[N];
        char[] hamp = new char[N];
        int answer = 0;

        String input = br.readLine();

        for (int i = 0; i < N; i++) {
            hamp[i] = input.charAt(i);
            if (hamp[i] == 'P') {
                check[i] = true;
            }
        }
        for (int i = 0; i < N; i++) {
            if (hamp[i] == 'P') {
                for (int j = i-K; j <= i+K; j++) {
                    if ((j >= 0 && j <hamp.length) && !check[j]) {
                        check[j] = true;
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
