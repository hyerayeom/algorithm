import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int T = scan.nextInt();
		int [] A= new int[T];
		int [] B= new int[T];
		int [] ans = new int[T];
		for(int i=0;i<T;i++) {
			A[i]=scan.nextInt();
			B[i]=scan.nextInt();
			ans[i]=A[i]+B[i];
		}
		for(int i=0;i<T;i++) {
			System.out.println(ans[i]);
		}
	}
}