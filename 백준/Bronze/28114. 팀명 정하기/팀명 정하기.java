import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        final int N = 3;
        int[][] countName = new int[N][2];
        int[] id = new int[N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            countName[i][0] = Integer.parseInt(st.nextToken());
            id[i] = Integer.parseInt(st.nextToken()) % 100;
            countName[i][1] = st.nextToken().charAt(0);
        }

        Arrays.sort(id);
        for(int i=0; i<N; i++) {
            sb.append(id[i]);
        }
        sb.append("\n");

        Arrays.sort(countName, Comparator.comparingInt(arr -> arr[0]));
        for(int i=N-1; i>= 0; i--) {
            sb.append(Character.toChars(countName[i][1]));
        }
        System.out.println(sb);
    }
}