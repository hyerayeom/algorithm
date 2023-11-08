import java.util.*;
import java.io.*;

public class Main {

    static int N, M, cabbage;
    static int[][] map;
    static boolean[][] visited;
    static int[] divX = {-1, 0, 1, 0};
    static int[] divY = {0, -1, 0, 1};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < T; test_case++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            cabbage = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < cabbage; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[x][y] = 1;
//                System.out.println("map["+x+"]["+y+"]");
            }

            count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        visited[i][j] = true;
                        count++;
                        BFS(i, j);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.add(new Point(x, y));

        while (!Q.isEmpty()) {
            Point select = Q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = select.x + divX[i];
                int nextY = select.y + divY[i];
//                System.out.println("i "+i);
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }
                if (map[nextX][nextY] == 0 || visited[nextX][nextY]) {
                    continue;
                }
                visited[nextX][nextY] = true;
                Q.add(new Point(nextX, nextY));
            }
        }

    } // BFS() END

} // END

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}