import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] visitor = new int[N];
        int sum = 0, max = 0, count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            visitor[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            sum += visitor[i];
            if (i == X - 1) {
                max = sum;
                count++;
            }
            if (i > X - 1) {
                sum -= visitor[i - X];
                if (max < sum) {
                    max = sum;
                    count = 1;
                } else if (max == sum) {
                    count++;
                }
            }
        }

        if (max == 0) {
            bw.write("SAD");
        } else {
            bw.write(max + "\n" + count);
        }
        bw.flush();
        bw.close();
    }
}