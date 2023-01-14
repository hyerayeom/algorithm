import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] d=new int[3];
        d[0] = scan.nextInt();
        d[1] = scan.nextInt();
        d[2] = scan.nextInt();
        int money=0;
        if (d[0] == d[1] && d[1] == d[2]) {
            money=10000+d[0]*1000;
        }else if(d[0] == d[1] || d[0] == d[2]){
            money=1000+d[0]*100;
        }else if(d[1]==d[2]){
            money=1000+d[1]*100;
        }else{
            int max=d[0];
            for(int i=1; i<d.length;i++) {
                if (d[i] > max) {
                    max = d[i];
                }
            }
            money=max*100;
        }
        System.out.println(money);
    }
}