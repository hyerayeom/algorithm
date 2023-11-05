import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] check;
    public static int[][] temp;
    public static int node, line, start;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        temp = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            temp[a][b] = temp[b][a] = 1;
        }

        dfs(start);
        sb.append("\n");
        check = new boolean[node + 1];

        bfs(start);

        System.out.println(sb);

    }

    public static void dfs(int start) {

        check[start] = true;
        sb.append(start + " ");

        for (int i = 0; i <= node; i++) {
            if (temp[start][i] == 1 && !check[i])
                dfs(i);
        }

    }

    public static void bfs(int start) {
        q.add(start);
        check[start] = true;

        while (!q.isEmpty()) {

            start = q.poll();
            sb.append(start + " ");

            for (int i = 1; i <= node; i++) {
                if (temp[start][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}