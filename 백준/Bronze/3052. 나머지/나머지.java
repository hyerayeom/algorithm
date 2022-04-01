import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] A = new int[10];
        int answer = 10;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
            A[i] %= 42;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    answer--;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}