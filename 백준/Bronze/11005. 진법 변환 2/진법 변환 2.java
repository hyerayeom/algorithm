import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuffer answer = new StringBuffer();
        while (N >= B) {
            int A = N % B;
            if (A > 9) {
                A += 55;
                answer.insert(0, Character.toChars(A));
            } else {
                answer.insert(0, N % B);
            }
            N /= B;
        }
        if(N > 0) {
            if (N > 9) {
                N += 55;
                answer.insert(0, Character.toChars(N));
            } else {
                answer.insert(0, N);
            }
        }
        System.out.println(answer);
    }
}