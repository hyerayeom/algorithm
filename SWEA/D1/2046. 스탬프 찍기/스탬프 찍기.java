import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++) {
        	sb.append("#");
        }
        System.out.print(sb);
	}
}