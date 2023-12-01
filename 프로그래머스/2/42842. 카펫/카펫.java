class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        boolean stop = true;
        int y = 1;
        
        while(stop) {
            if(yellow % y == 0) {
                int x = yellow / y;
                int temp = (x+y) * 2 + 4;
                if(temp == brown) {
                    answer[0] = x+2;
                    answer[1] = y+2;
                    stop = false;
                }
            }
            y++;
        }
        return answer;
    }
}