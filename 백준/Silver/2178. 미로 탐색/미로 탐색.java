import java.util.*;
import java.io.*;

public class Main {
    static boolean visit[][];
    static int maze[][];
    static Queue<Node> q = new LinkedList<>();
    static int Y[] = {-1, 1, 0, 0};
    static int X[] = {0, 0, -1, 1};
    static int now_x, now_y;
    static int x, y;
    static int N, M;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visit = new boolean[N][M];
        maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();

            for (int j = 0; j < M; j++) {
                char ch = temp.charAt(j);
                maze[i][j] = Character.getNumericValue(ch);
            }
        }

        bfs(0, 0);
        System.out.println(maze[N - 1][M - 1]);
    }

    static void bfs(int x, int y) {
        q.offer(new Node(x, y));
        visit[y][x] = true;

        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < 4; i++) {
                now_y = node.y + Y[i];
                now_x = node.x + X[i];

                if (Range_check() == true && visit[now_y][now_x] == false && maze[now_y][now_x] == 1) {
                    q.offer(new Node(now_x, now_y));
                    visit[now_y][now_x] = true;

                    maze[now_y][now_x] = maze[node.y][node.x] + 1;
                    if (visit[N - 1][M - 1] == true) {
                        return;
                    }
                }
            }
        }
    }

    public static boolean Range_check() {
        return (now_x >= 0 && now_x < M && now_y >= 0 && now_y < N);
    }
}
