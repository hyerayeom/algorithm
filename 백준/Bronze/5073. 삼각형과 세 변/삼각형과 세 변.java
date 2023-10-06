import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int[] triangle = new int[3];
            for (int i = 0; i < triangle.length; i++) {
                triangle[i] = Integer.parseInt(st.nextToken());
            }
            if(triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0){
                break;
            }

            Arrays.sort(triangle);

            if(triangle[2] >= triangle[0]+triangle[1]){
                bw.write("Invalid" + "\n");
            }else {
                if(triangle[0] == triangle[1] && triangle[1] == triangle[2]){
                    bw.write("Equilateral" + "\n");
                } else if (triangle[0] != triangle[1] && triangle[1] != triangle[2] && triangle[0] != triangle[2]) {
                    bw.write("Scalene" + "\n");
                }else {
                    bw.write("Isosceles" + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}