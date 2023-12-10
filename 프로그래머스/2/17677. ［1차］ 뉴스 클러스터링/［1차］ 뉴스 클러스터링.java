import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        ArrayList<String> S1 = new ArrayList<>();
        ArrayList<String> S2 = new ArrayList<>();

        separate(str1, S1);
        separate(str2, S2);

        double SAME = same(S1, S2);
        double UNION = union(S1, S2);
        double jakard;
        if(UNION == 0) {
            jakard = 1;
        } else {
            jakard = SAME / UNION;
        }

        answer = (int)(65536 * jakard);
        return answer;
    } // main END

    public static void separate(String str, ArrayList S) {
        str = str.toLowerCase();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char C = str.charAt(i);
            if (C < 97 || C > 122) {
                temp.setLength(0);
                continue;
            }
            temp.append(C);
            if (temp.length() == 2) {
                S.add(temp.toString());
                temp.deleteCharAt(0);
            }
        }
    } // separate END

    public static double union(ArrayList S1, ArrayList S2) {
        ArrayList<String> unionS = (ArrayList<String>) S2.clone();
        ArrayList<String> tempS2 = (ArrayList<String>) S2.clone();
        for (int i = 0; i < S1.size(); i++) {
            if (tempS2.contains(S1.get(i))) {
                tempS2.remove(tempS2.indexOf(S1.get(i)));
            } else {
                unionS.add((String) S1.get(i));
            }
        }
        double count = unionS.size();
        return count;
    } // union END

    public static double same(ArrayList S1, ArrayList S2) {
        double count = 0;
        ArrayList<String> tempS2 = (ArrayList<String>) S2.clone();
        for (int i = 0; i < S1.size(); i++) {
            if (tempS2.contains(S1.get(i))) {
                count++;
                tempS2.remove(tempS2.indexOf(S1.get(i)));
            }
        }
        return count;
    } // same END

}