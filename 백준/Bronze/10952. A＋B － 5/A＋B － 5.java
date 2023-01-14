import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int A, B, ans;
		
		 while(true) {
			 A=scan.nextInt();
			 B=scan.nextInt();
			 ans=A+B;
			 if(A==0 && B==0) {
				 break;
			 }
			 System.out.println(ans);
		 }
	}
}
