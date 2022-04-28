import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int N=scan.nextInt();
        double[] score=new double[N];
        for(int i=0;i<N;i++){
            score[i]=scan.nextDouble();
        }
        Arrays.sort(score);
        double max=score[N-1];

        double sum=0;
        double answer=0;
        for(int i=0;i<N;i++){
            score[i]=(score[i]/max)*100;
            sum+=score[i];
            if(i==N-1){
                answer=sum/N;
            }
        }
        System.out.println(answer);
    }
}