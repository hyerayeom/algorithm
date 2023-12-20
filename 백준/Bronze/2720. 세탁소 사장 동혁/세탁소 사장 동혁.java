import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] changes = {25, 10, 5, 1};
        int[] count = new int[4];
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            int cost = Integer.parseInt(br.readLine());
            int i=0;
            while (i!=4) {
                if(cost / changes[i] > 0) {
                    count[i] = cost / changes[i];
                    cost -= changes[i] * count[i];
                } else {
                    count[i] = 0;
                }
                i++;
            }
            for(int a=0;a<4;a++) {
                sb.append(count[a] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}