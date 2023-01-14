import java.util.*;
public class Main{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int H=scan.nextInt();
		int M=scan.nextInt();
		
		if(M<45) {
			if(H==0) {
				H=24;
			}
			H-=1;
			M=60-45+M;
			System.out.println(H);
			System.out.print(M);
		}else {
			M-=45;
			System.out.println(H);
			System.out.print(M);
		}
	}
	
}