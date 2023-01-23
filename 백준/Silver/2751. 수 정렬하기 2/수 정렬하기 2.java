import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] number = new int[N];

        for(int i = 0; i < N; i++) {
            number[i] =  Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(number);

        for(int i=0; i<number.length; i++){
            sb.append(number[i]).append("\n");
        }
        System.out.println(sb);
    }
}
