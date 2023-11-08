import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        count = N;

        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = map[y][x] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(map[i][j] == 1 && !visited[i]) {
                    visited[i] = true;
                    DFS(i);
//                    System.out.println(count);
                    break;
                }
            }
        }
        System.out.println(count);

    }

    public static void DFS(int start) {

        for (int i = 1; i <= N; i++) {
            if(map[start][i] == 1 && !visited[i]) {
                count--;
                visited[i] = true;
//                System.out.println("start = " + start + " node = " + i);
                DFS(i);
            }
        }
    }

} // END