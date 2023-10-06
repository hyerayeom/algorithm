import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] input = new int[9][9];
        int max = 0;
        int x = 0, y = 0;

        for (int i = 0; i < input.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < input.length; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (max <= input[i][j]) {
                    max = input[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}

