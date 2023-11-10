import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        final int N = Integer.parseInt(br.readLine());
        boolean even = false; //홀수번째 줄 = false, 짝수번째 줄 = true
        int count = 1;
        int M = 1;
        int J = 1;
        int spot = count + 1;

        if (count == N) {
            sb.append(J + "/" + M);
            System.out.println(sb);
            return;
        }

        loop:
        while (true) {

            if (!even) { // 짝수번째 줄이라면
                M = spot + 1;
                for (int i = 1; i <= spot; i++) {
                    count++;
                    J = i;
                    M -= 1;

//                    sb.append(J + "/" + M);
//                    System.out.println(sb);

                    if(count == N) {
                        sb.append(J + "/" + M);
                        System.out.println(sb);
                        return;
                    }

                }
            } else { // 홀수번째 줄이라면
                J = spot + 1;
                for (int i = 1; i <= spot; i++) {
                    count++;
                    J -= 1;
                    M = i;

//                    sb.append(J + "/" + M);
//                    System.out.println(sb);

                    if(count == N) {
                        sb.append(J + "/" + M);
                        System.out.println(sb);
                        return;
                    }
                }
            }

            if(count >= N) {
                return;
            }
            even = !even;
            spot++;

        } // while END
    }
}