import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> S = new ArrayList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String oper = st.nextToken();

            if(oper.equals("all")) {
                S.clear();
                for(int a=1; a<=20; a++) {
                    S.add(a);
                }
                continue;
            }else if(oper.equals("empty")) {
                S.clear();
                continue;
            }

            int number = Integer.parseInt(st.nextToken());
            switch (oper) {
                case "add" :
                    if(!S.contains(number)){
                        S.add(number);
                    }
                    break;
                case "remove" :
                    if(S.contains(number)) {
                        S.remove(S.indexOf(number));
                    }
                    break;
                case "toggle" :
                    if(S.contains(number)) {
                        S.remove(S.indexOf(number));
                    }else {
                        S.add(number);
                    }
                    break;
                case "check" :
                    if(S.contains(number)) {
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}