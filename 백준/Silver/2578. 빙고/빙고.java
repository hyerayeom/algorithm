import java.util.*;
import java.io.*;

public class Main {
    
    static final int N = 5;
    static int[][] bingo;
    static int count = 0, lineCount = 0;
    static boolean[] sideCheck = {false, false};
    static ArrayList<Integer> G = new ArrayList<>();
    static ArrayList<Integer> S = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        bingo = new int[N][N];

        for (int i = 0; i < N; i++) { // bingo 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        loop:
        for (int i = 0; i < N; i++) { // 정답 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int input = Integer.parseInt(st.nextToken());
                count++;

                if(checkBingo(input)) {
                    System.out.println(count);
                    return;
                }

            }
        }

    }

    public static boolean checkBingo(int input) {

        for (int i = 0; i < N; i++) { // 빙고 찾아 0 처리
            for (int j = 0; j < N; j++) {
                if (bingo[i][j] == input) {
                    bingo[i][j] = 0;
                }
            }
        }

//        System.out.println("input = " + input + " ");
//        for (int i = 0; i < N; i++) { // 빙고 찾아 0 처리
//            for (int j = 0; j < N; j++) {
//                System.out.print(bingo[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < N; i++) { // 가로 검사
            if (G.contains(i)) { // 이미 빙고된 행일 경우 1행 검사 멈추기
                continue;
            }
            for (int j = 0; j < N; j++) {
                if (bingo[i][j] != 0) { // 안 불린 숫자라면 1행 검사 멈추기
                    break;
                } else if (j == N - 1) { // 1행이 모두 0으로 빙고된 경우
                    lineCount++;
                    G.add(i);
//                    System.out.println(" - 1 - lineCount = " + lineCount + "\n");
                }
            }
        }

        for (int i = 0; i < N; i++) { // 세로 검사
            if (S.contains(i)) { // 이미 빙고된 열일 경우 1열 검사 멈추기
                continue;
            }
            for (int j = 0; j < N; j++) {
                if (bingo[j][i] != 0) { // 안 불린 숫자라면 1열 검사 멈추기
                    break;
                } else if (j == N - 1) { // 1열이 모두 0으로 빙고된 경우
                    lineCount++;
                    S.add(i);
//                    System.out.println(" - 2 - lineCount = " + lineCount + "\n");
                }
            }
        }

        for(int i=0; i<N; i++) { // 좌상 -> 우하 대각선 검사
            if(sideCheck[0]) { // 이미 빙고된 대각선일 경우 검사 종료
                break;
            }
            if(bingo[i][i] != 0) { // 00, 11, 22, 33, 44, 55
                break;
            } else if (i == N-1){
                lineCount++;
                sideCheck[0] = true;
//                System.out.println(" - 3 - lineCount = " + lineCount + "\n");
            }
        }

        for(int i=0; i<N; i++) { // 우상 -> 좌하 대각선 검사
            if (sideCheck[1]) { // 이미 빙고된 대각선일 경우 검사 종료
                break;
            }
            if (bingo[i][(N-1)-i] != 0) { // 04, 13, 22, 31, 40
                break;
            }
            if (i == N-1) {
                lineCount++;
                sideCheck[1] = true;
//                System.out.println(" - 4 - lineCount = " + lineCount + "\n");
            }
        }


        if(lineCount >= 3) {
            return true;
        } else {
            return false;
        }

    }

}
