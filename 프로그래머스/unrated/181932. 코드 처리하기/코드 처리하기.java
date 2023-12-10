class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false; // mode == 0
        
        for (int i = 0; i < code.length(); i++) {
            char C = code.charAt(i);
            if (C == '1') {
                mode = !mode;
            } else {
                if ( (!mode && (i % 2 == 0)) || (mode && (i % 2 == 1)) ) {
                    answer += C;
                }
            }
        }
        
        if(answer.isEmpty()){
            answer= "EMPTY";
        }
        
        return answer;
    }
}