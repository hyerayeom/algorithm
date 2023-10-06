import java.util.*;
import java.io.*;

public class Main {
    static Queue<Integer> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Deque<Integer> Q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            Q.add(i + 1);
        }

        int temp = 0;
        int count = M;
        boolean change = false;

        while (!Q.isEmpty()) {

            if (change) { // 반전 방향
                for (int i = 0; i < K - 1; i++) {
                    temp = Q.pollLast();
                    Q.addFirst(temp);
                }
                count++;
                if (count == M) {
                    change = !change;
                }
                sb.append(Q.pollLast()).append("\n");
            } else { // 원방향
                for (int i = 0; i < K - 1; i++) {
                    temp = Q.pollFirst();
                    Q.addLast(temp);
                }
                count--;
                if (count == 0) {
                    change = !change;
                }
                sb.append(Q.pollFirst()).append("\n");
            }
        }
        System.out.print(sb);
    }
}