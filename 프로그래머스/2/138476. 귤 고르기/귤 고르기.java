import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int tangerineLength = tangerine.length;
        int[] count = new int[10000001];
        for(int i=0; i<tangerineLength; i++) {
            int temp = tangerine[i];
            count[temp]++;
        }
        Arrays.sort(count);
        int sum = 0;
        int i=count.length-1;
        while (!(sum >= k)) {
            sum += count[i];
            i--;
            answer++;
        }
        return answer;
    }
}