import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] score = new int[8][2];
        for (int i = 0; i < score.length; i++) {
            score[i][0] = Integer.parseInt(br.readLine());
            score[i][1] = i + 1;
        }

        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        int total = 0;
        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            total += score[i + 3][0];
            number[i] = score[i + 3][1];
        }
        Arrays.sort(number);
        System.out.println(total);
        for (int i = 0; i < 5; i++) {
            System.out.print(number[i] + " ");
        }
    }
}