import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int X = Integer.parseInt(br.readLine());
        int stick = 64;
        int sum =X, count=0;

        while(sum != 0){
            if(stick > sum){
                stick /=2;
            } else {
                count++;
                sum -= stick;
            }
        }
        System.out.println(count);
    }

}