import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = 5;
        int sum = 0;
        int[] number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = scan.nextInt();
            sum += number[i];
            if (i == N - 1) {
                sum /= N;
            }
        }
        Arrays.sort(number);
        System.out.println(sum);
        System.out.println(number[2]);
    }
}