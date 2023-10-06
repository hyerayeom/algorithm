import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            ArrayList<Integer> student = new ArrayList<>();
            int count = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 21; j++) {
                student.add(Integer.parseInt(st.nextToken()));
                for (int k = j; k > 1; k--) {
                    if (student.get(k - 1) > student.get(k)) {
                        student.add(k - 1, student.get(k));
                        student.remove(k + 1);
                        count++;
                    }
                }
            }
            bw.write(student.get(0) + " " + count + "\n");
        }
        bw.flush();
        bw.close();
    }
}