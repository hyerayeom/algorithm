import java.util.*; 
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int x = a * (b%10); // 1의 자리 곱
		int y = a * ((b%100)/10); // 10의 자리 곱
		int z = a * (b/100); //100의 자리 곱
		int ans = x+(y*10)+(z*100);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(ans);
	}
}