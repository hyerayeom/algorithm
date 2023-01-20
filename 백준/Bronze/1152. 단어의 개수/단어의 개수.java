import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String S = scan.nextLine();
        S = S.trim();
        
		String answer[] = S.split(" ");
		if(answer.length == 1 && answer[0].equals("")) {
			System.out.println(0);
		}else {
			System.out.println(answer.length);
		}
	}
}