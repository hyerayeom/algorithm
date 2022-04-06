import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=scan.nextInt();
        }
        Arrays.sort(temp);
        System.out.print(temp[0]+" ");
        System.out.print(temp[n-1]);
    }
}