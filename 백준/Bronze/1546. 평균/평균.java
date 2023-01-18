import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double[] score = new double[N];

        for (int i = 0; i < N; i++) {
            score[i] = scan.nextInt();
        }
        Arrays.sort(score);
        double max = score[N-1];
        double sum=0;
        for (int j = 0; j < N; j++) {
            score[j] = (score[j]/max) * 100;
            sum+=score[j];
        }
        double average=sum/(double)N;
        System.out.println(average);
    }
}