import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N=scan.nextInt();
        int k=scan.nextInt();  
        Integer[] score = new Integer[N];

        for(int i=0; i<N; i++){
            score[i]= scan.nextInt();
        }
        scan.close();

        Arrays.sort(score);
        System.out.println(score[N-k]);
    }
}