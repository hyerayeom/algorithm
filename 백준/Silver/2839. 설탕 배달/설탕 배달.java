import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static boolean[] visited;
    static int[] gram = {5, 3};
    static int[] sugar;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        visited = new boolean[5001];
        sugar = new int[5001];

//        Arrays.fill(sugar, -1);

        System.out.println(BFS());

    }

    public static int BFS() {
//        Queue<Integer> Q = new LinkedList<>();
        ArrayList<Integer> Arr = new ArrayList<>();

        Arr.add(N);
        visited[N] = true;

        int answer = 0;

        loop:
        while (!Arr.isEmpty()) {
            int now = Arr.get(0);
            Arr.remove(0);

            for (int i = 0; i < 2; i++) {
                int next = now - gram[i];

                if (next < 0 || visited[next]) {
                    continue;
                }

                sugar[next] = sugar[now] + 1;

                if (next == 0) {
                    answer = sugar[next];
                    break loop;
                }

                visited[next] = true;
                Arr.add(next);
            }
        }
        if(answer == 0) {
            answer = -1;
        }
        return (answer);
    }

}
