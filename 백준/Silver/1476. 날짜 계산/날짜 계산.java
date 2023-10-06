import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

//        long startTime = System.currentTimeMillis();

        st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int e = 1, s = 1, m = 1, year = 1;

        while (true) {
            if (E == e && S == s && M == m) {
                System.out.println(year);
//                long endTime = System.currentTimeMillis();
//                System.out.println(endTime-startTime + "초");
                return;
            }

            e++;
            s++;
            m++;
            year++;

            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if(m == 20) {
                m = 1;
            }
        }

    }
}
