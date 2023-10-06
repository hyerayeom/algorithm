import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Scanner scan = new Scanner(System.in);

        int answer=0;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());
        int[] map = new int[N+1];
        int[] basket = new int[2];
        basket[0]=1;
        basket[1]=M;
        int[] drop = new int[J+1];
        for(int i=1; i<=J; i++){
            drop[i] = Integer.parseInt(br.readLine());
        }
        for(int i=1; i<=J; i++){
            if(drop[i] >= basket[0] && drop[i] <= basket[1]) { // 사과 추락 위치가 바구니에 있을 경우
                continue;
            }else {
                if(drop[i]>basket[1]){ // 사과 추락 위치가 바구니보다 뒤에 있을 경우
                    while(drop[i] != basket[1]){
                        basket[0]++;
                        basket[1]++;
                        answer++;
                    }
                } else {
                    while(drop[i] != basket[0]){
                        basket[0]--;
                        basket[1]--;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
