import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            count += isPrime(a);
        }
        System.out.println(count);
    }
    public static int isPrime(int num){
        if(num ==0 || num == 1) return 0;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return 0;
        }
        return 1;
    }
}