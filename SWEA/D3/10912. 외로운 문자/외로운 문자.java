import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            String inputS = br.readLine();

            char[] temp = inputS.toCharArray();
            ArrayList<Character> chList = new ArrayList<>();
            for(char i : temp) {
                chList.add(i);
            }
            Collections.sort(chList);
//            System.out.println("첫 정렬 = " + chList);

            loop:
            while (true) {
                if(chList.isEmpty() || chList.size() == 1) {
                    break;
                }
                for(int i = 0; i< chList.size()-1; i++) {

                    if (chList.get(i).equals(chList.get(i + 1))) {
//                        System.out.println("i = " + chList.get(i) + " i+1 = " + chList.get(i+1));
                        chList.remove(i);
                        chList.remove(i);
//                        System.out.println(chList);
                        break;
                    }

                    if(i == chList.size()-2) {
                        break loop;
                    }
                }
            }

//            System.out.println(chList);

            String answer = "";
            if(chList.isEmpty()) {
                answer = "Good";
            } else {
                for (char i : chList) {
                    answer += i;
                }
            }

//            System.out.println(answer);

            sb.append("#" + test_case + " " + answer + "\n");
        } // test_case END
        System.out.println(sb);
    } // main END

} // END