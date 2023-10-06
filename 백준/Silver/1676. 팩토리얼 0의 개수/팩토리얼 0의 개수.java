import java.io.*;

import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());   

        int count2=0;
        int count5=0;

        for(int i=0; i<=N; i++) {
            int i2= i;
            int i5=i;

            while(true){
                if(i2%2 !=0 || i2 ==0){
                    break;
                }

                count2++;
                i2 /= 2;
            }

            while(true){
                if(i5%5 != 0 || i5 ==0){
                    break;
                }

                count5++;
                i5 /= 5;
            }

        }
        
        int answer = count2 < count5 ? count2:count5;
        System.out.println(answer);
    }
}