import java.io.*;
import java.util.*;

public class Main {
    public static int Computer, Network, count;
    public static boolean[][] G;
    public static boolean[] visit;

    public static void dfs(int v) {
        count++;
        visit[v] = true;
        for (int i = 1; i <= Computer; i++) {
            if ((!visit[i]) && (G[v][i])) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Computer = Integer.parseInt(br.readLine());
        Network = Integer.parseInt(br.readLine());
        G = new boolean[Computer + 1][Computer + 1];
        visit = new boolean[Computer + 1];

        for (int i = 0; i < Network; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());

            G[a1][a2] = true;
            G[a2][a1] = true;
        }

        count = 0;
        dfs(1);

        System.out.println(count - 1);
    }
}