class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuffer lay = new StringBuffer();

        for (int i = 1; i < food.length; i++) {
            int temp = food[i] / 2;
            if (temp > 0) {
                for (int j = 0; j < temp; j++) {
                    lay.append((i));
                }
            }
        }
        answer += lay;
        answer += "0";
        answer += lay.reverse();
        
        return answer;
    }
}