import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] number = new int[N];
		
		for(int i = 0; i < N; i++) {
			number[i] = scan.nextInt();
        }
        scan.close();
        
		Arrays.sort(number);
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
 
	}
}