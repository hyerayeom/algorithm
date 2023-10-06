import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = 9;
        int[] input = new int[N];
        int max = 0;
        int index = 0;

        for(int i=0; i<N; i++) {
            input[i] = Integer.parseInt(br.readLine());
            if (input[i] > max) {
                max = input[i];
                index = i + 1;
            }
        }
        sb.append(max).append("\n").append(index);
        System.out.println(sb);
    }
}
