import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int X=scan.nextInt();
        int N= scan.nextInt();
        int[] a=new int[N];
        int[] b=new int[N];
        int total=0;

        for(int i=0; i<N; i++){
            a[i]=scan.nextInt();
            b[i]=scan.nextInt();
            total+=a[i]*b[i];
        }
        if(total==X){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}