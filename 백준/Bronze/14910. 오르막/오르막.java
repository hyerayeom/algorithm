import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int tokenCount = st.countTokens();
        int[] input = new int[tokenCount];

        input[0] = Integer.parseInt(st.nextToken());

        if(tokenCount == 1){
            bw.write("Good");
        } else {
            for (int i = 1; i < tokenCount; i++) {
                input[i] = Integer.parseInt(st.nextToken());
                if(input[i-1] > input[i]) {
                    bw.write("Bad");
                    break;
                }else if(i==tokenCount-1){
                    bw.write("Good");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}