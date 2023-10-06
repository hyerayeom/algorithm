import java.io.*;
import java.util.*;

public class Main {
    static int N, M, startX, startY;
    static int[][] map, distance;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        distance = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    startX = i;
                    startY = j;
                    map[startX][startY] = 0;
                    distance[startX][startY] = 0;
                }
            }
        }

        BFS(startX, startY);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 1 && distance[i][j] == 0){
                    distance[i][j] = -1;
                }
                bw.write(distance[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void BFS(int i, int j) {
        Queue<int[]> Q = new LinkedList<>();
        Q.offer(new int[]{i, j});

        while (!Q.isEmpty()) {
            int now[] = Q.poll();
            visited[i][j] = true;

            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (map[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        distance[x][y] = distance[now[0]][now[1]] + 1;
                        Q.add(new int[]{x, y});
                    }
                }

            }
        }
    }

}