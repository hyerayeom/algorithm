import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int hour=scan.nextInt();
        int min=scan.nextInt();
        int time=scan.nextInt();
        min+=time;
        while(min>=60){
            min -= 60;
            hour++;
        }
        if(hour>=24){
            hour%=24;
        }
        System.out.println(hour+" "+min);
    }
}