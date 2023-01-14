import java.util.*;
public class Main
{
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
  
    	int N=scan.nextInt();
    	int A=0;
    	int temp=0;    	
    	int subN=N;
    	
    	while(true) {
    		
    		A=(subN%10*10)+((subN/10)+(subN%10))%10;
    		subN=A;
        	temp++;
        	if(A==N) {
        		break;
        	}
    	}    
    	System.out.print(temp);
    }
}