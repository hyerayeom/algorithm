import java.util.*;
import java.io.*;

public class Main {
    static int N, K;
    static boolean[] visited = new boolean[100001];
    static int[] map = new int[100001];
    static int[] move = {-1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        BFS(N);

        System.out.println(map[K]);

    }

    public static void BFS(int start) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(start);

        loop:
        while (!Q.isEmpty()) {
            int now = Q.poll();
            visited[now] = true;

            if (now == K) {
                break;
            }

            for (int i = 0; i < 3; i++) {
                int moving;
                if (i == 2) {
                    moving = now * move[i];
                } else {
                    moving = now + move[i];
                }

                if (moving < 0 || moving > 100000 || visited[moving]) {
                    continue;
                }
                map[moving] = map[now] + 1;
                visited[moving] = true;
                Q.add(moving);
//                System.out.println("moving = " + moving);
            }

        }

    }

} // END