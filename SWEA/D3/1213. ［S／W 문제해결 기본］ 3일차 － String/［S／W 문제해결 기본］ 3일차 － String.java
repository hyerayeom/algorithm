import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = 10;
		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			String input = br.readLine();
			String S = br.readLine();
			int count = 0;
			
			for(int i=0; i<=S.length()-(input.length()); i++) {
				if(S.substring(i, i+(input.length())).equals(input)) {
					count++;
				}
			}
			sb.append("#"+(N)+" "+count+"\n");
		}
		System.out.println(sb);
	}
}