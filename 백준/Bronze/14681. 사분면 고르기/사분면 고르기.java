import java.util.*; 
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		if(x>0 && y>0) {
			System.out.print(1);
		}else if(x<0 && y>0) {
			System.out.print(2);
		}else if(x<0 && y<0) {
			System.out.print(3);
		}else {
			System.out.print(4);
		}
	}
}


