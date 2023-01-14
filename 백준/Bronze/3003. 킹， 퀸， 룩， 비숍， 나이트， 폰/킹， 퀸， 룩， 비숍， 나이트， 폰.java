import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] a=new int[6];

        for(int i=0; i<a.length;i++) {
            a[i] = scan.nextInt();
            if (0<=i && i < 2) {
                a[i]-=1;
                if(a[i]>0 ||a[i]<0){
                    a[i]=-a[i];
                }

            }else if(2<=i && i<5) {
                a[i]-=2;
                if(a[i]>0 ||a[i]<0){
                    a[i]=-a[i];
                }

            }else{
                a[i]-=8;
                if(a[i]>0 ||a[i]<0){
                    a[i]=-a[i];
                }
            }
        }
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}