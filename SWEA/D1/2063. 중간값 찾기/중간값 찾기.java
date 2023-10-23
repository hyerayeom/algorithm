import java.io.*;
import java.util.*;

public class Solution {
   public static void main(String[] args) throws IOException {
      StringBuilder sb = new StringBuilder();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int N = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      int[] input = new int[st.countTokens()];
      for(int i=0; i<N; i++) {
    	  input[i] = Integer.parseInt(st.nextToken());
      }
      
      Arrays.sort(input);
      
      System.out.print(input[N/2]);
      
   }
}