import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] divX = {-1, 0, 1, 0};
    static int[] divY = {0, -1, 0, 1};
    static ArrayList<Integer> answer = new ArrayList<>();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = Character.getNumericValue(input.charAt(j));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count++;
                    visited[i][j] = true;
                    BFS(i, j);
                }
            }
        }
        
        Collections.sort(answer);
        sb.append(count).append("\n");
        if(answer.isEmpty()){
            answer.add(0);
        }
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
            if(i != answer.size()-1){
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
//        visited[x][y] = true;

        int sum = 1;

        while (!Q.isEmpty()) {
            Point S = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = S.x + divX[i];
                int nextY = S.y + divY[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
                    continue;
                }
                if (map[nextX][nextY] != 1 || visited[nextX][nextY]) {
                    continue;
                }
                sum++;
                visited[nextX][nextY] = true;
//                System.out.println(sum + " : visited[" + nextX + "]" + "[" + nextY + "]");
                Q.add(new Point(nextX, nextY));
            }
        }
        answer.add(sum);
    }

} // END

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}