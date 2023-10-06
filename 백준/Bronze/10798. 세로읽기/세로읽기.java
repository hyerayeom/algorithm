import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String[] input = new String[5];
        int max =0;
        for(int i=0; i<input.length; i++){
            input[i] = br.readLine();
            if(input[i].length() > max){
                max = input[i].length();
            }
        }

        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                if(input[j].length() <= i){
                    continue;
                }
                bw.write(input[j].charAt(i));
            }
        }
        bw.flush();
        bw.close();

    }
}