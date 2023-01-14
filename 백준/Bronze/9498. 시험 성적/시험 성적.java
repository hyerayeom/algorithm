import java.util.*; 
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		
		if(test>=90) {
			System.out.print("A");
		}else if(test>=80) {
			System.out.print("B");
		}else if(test>=70) {
			System.out.print("C");
		}else if(test>=60) {
			System.out.print("D");
		}else {
			System.out.print("F");
		}	
	}
}


