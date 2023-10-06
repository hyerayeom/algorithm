import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] input = new int[2];
        while (true){
            st = new StringTokenizer(br.readLine());
            input[0] = Integer.parseInt(st.nextToken());
            input[1] = Integer.parseInt(st.nextToken());
            if(input[0]==0 && input[1]==0) {
                bw.flush();
                bw.close();
                return;
            }
            if (input[0]%input[1] == 0) {
                bw.write("multiple" + "\n");
            } else if (input[1]%input[0] == 0) {
                bw.write("factor" + "\n");
            } else {
                bw.write("neither" + "\n");
            }
        }
    }
}

