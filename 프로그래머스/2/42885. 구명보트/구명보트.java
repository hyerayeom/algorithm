import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        ArrayList<Integer> weight = new ArrayList<>();
        for (int i : people) {
            weight.add(i);
        }

        Collections.sort(weight);

        int a = 0;

        for (int i = weight.size() - 1; i >= a; i--) {
            answer++;
            if (weight.get(a) + weight.get(i) <= limit) {
                a++;
            }
        }
        
        return answer;
    }
}