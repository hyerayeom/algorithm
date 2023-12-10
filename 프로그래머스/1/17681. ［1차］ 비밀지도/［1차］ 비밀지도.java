class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
                for (int i = 0; i < n; i++) {
            int temp = arr1[i] | arr2[i];

            String B = String.format("%16s", Integer.toBinaryString(temp));
            B = B.substring(B.length()-n);
            String S = "";
            for (int j = 0; j < n; j++) {
                if (B.charAt(j) == '1') {
                    S += "#";
                } else {
                    S += " ";
                }
            }
            answer[i] = S;
//            System.out.println(answer[i]);
        }
        
        
        return answer;
    }
}