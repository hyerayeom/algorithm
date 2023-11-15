import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<Integer> answer = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                answer.add(i);
            }

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                ArrayList<Integer> inputNumbers = new ArrayList<>();
                for (int a = 0; a < 4; a++) {
                    inputNumbers.add(Integer.parseInt(st.nextToken()));
                }

                ArrayList<Integer> removeList = new ArrayList<>();
                String OX = st.nextToken();
                if (OX.equals("YES")) {
                    for (int a = 0; a < answer.size(); a++) {
                        if (!inputNumbers.contains(answer.get(a))) {
                            removeList.add(answer.get(a));
                        }
                    }
                } else {
                    for (int a = 0; a < answer.size(); a++) {
                        if (inputNumbers.contains(answer.get(a))) {
                            removeList.add(answer.get(a));
                        }
                    }
                }
                for(int a = 0; a<removeList.size(); a++) {
                    int targer = removeList.get(a);
                    answer.remove(Integer.valueOf(targer));
                }
            }
            sb.append("#" + test_case + " " + answer.get(0) + "\n");
        } // test_case END
        System.out.println(sb);
    } // main END
} // END
